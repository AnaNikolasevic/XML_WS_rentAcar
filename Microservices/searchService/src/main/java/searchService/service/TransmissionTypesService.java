package searchService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import searchService.repository.BrandsRepository;
import searchService.repository.TransmissionTypesRepository;

@Service
public class TransmissionTypesService {

    @Autowired
    private TransmissionTypesRepository transmissionTypesRepository;
}
