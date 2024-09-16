package com.example.ProductDiscount.repository;

import com.example.ProductDiscount.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
//    @Query(nativeQuery = true, value="SELECT pname, cost -(cost*discount/100) AS total_price FROM products")
    List<Product> findAll();
    }


