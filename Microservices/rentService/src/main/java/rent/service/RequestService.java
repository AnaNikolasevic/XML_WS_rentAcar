package rent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rent.dto.PurchaseDTO;
import rent.dto.RequestDTO;
import rent.model.Purchase;
import rent.model.Request;
import rent.repository.PurchaseRepository;
import rent.repository.RequestRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;


    public Purchase createPurchase(PurchaseDTO p){

        Purchase purchase = new Purchase();
        purchase.setDate_from(p.getDate_from());
        purchase.setDate_to(p.getDate_to());
        purchase.setId_add(p.getId_add());
        purchase.setOrdered(false);
        purchase.setClient(p.getClient());

        return purchase;
    }

    public Request createBundleRequest(List<PurchaseDTO> purchases){

        Request request = new Request();
        request.setStatus("PENDING");
        for (PurchaseDTO p : purchases){
            Purchase purchase = this.createPurchase(p);
            purchase.setRequest(request);
            purchaseRepository.save(purchase);

        }
        requestRepository.save(request);
        return request;
    }

    public ArrayList<Request> createRequest(List<PurchaseDTO> purchases){

        ArrayList<Request> requests = new ArrayList();
        List<Purchase> purchasesForRequest = new ArrayList();
        for (PurchaseDTO p : purchases){
            Request request = new Request();
            request.setStatus("PENDING");
            Purchase purchase = this.createPurchase(p);
            purchase.setRequest(request);
            purchasesForRequest.add(purchase);
            //request.setPurchaseList(purchasesForRequest);
            purchaseRepository.save(purchase);
            requestRepository.save(request);
            requests.add(request);
        }
        return requests;
    }
    public void  deleteRequest (Long id){
        Request request = requestRepository.findById(id).orElse(null);
        if (request == null){
            throw new NoSuchElementException();
        }
        requestRepository.delete(request);
    }

    public ArrayList<RequestDTO> getAllRequests(){
        List<Request> requests = new ArrayList<>();
        requests = requestRepository.findAll();
        ArrayList<RequestDTO> requestDTOS = new ArrayList<>();
        for(Request r : requests){
            requestDTOS.add(new RequestDTO(r));
        }
        return  requestDTOS;
    }

    public RequestDTO getRequest(Long id){
        Request request = requestRepository.findById(id).orElse(null);
        if (request == null){
            throw new NoSuchElementException();
        }
        return new RequestDTO(request);
    }
}