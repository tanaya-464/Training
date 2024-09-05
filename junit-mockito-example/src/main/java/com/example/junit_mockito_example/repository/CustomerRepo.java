package com.example.junit_mockito_example.repository;

import com.example.junit_mockito_example.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>
{
    //Spring data jpa  will automatically
    // provide implementation for it when using existsBy{fieldName}
    boolean existsById(Integer id);
}


