package agentBackend.service;

import agentBackend.repository.CompanyRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public boolean verify(String username) throws NotFoundException {
        if (!this.companyRepository.existsByUsername(username)) {
            return false;
        }
        return true;

    }
}
