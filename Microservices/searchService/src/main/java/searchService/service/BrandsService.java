package searchService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import searchService.repository.BrandsRepository;

@Service
public class BrandsService {

    @Autowired
    private BrandsRepository brandsRepository;
}
