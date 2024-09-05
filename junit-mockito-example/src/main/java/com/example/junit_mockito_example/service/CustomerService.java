package com.example.junit_mockito_example.service;

import com.example.junit_mockito_example.entities.Customer;
import com.example.junit_mockito_example.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    //No need to use @Autowired when using Constructor Injection
    //Dependencies are final

    private final CustomerRepo repo;


    public CustomerService(CustomerRepo repo) {
        this.repo = repo;
    }

    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

}
