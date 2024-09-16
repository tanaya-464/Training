package com.example.ProductDiscount.service;

import com.example.ProductDiscount.model.Product;
import com.example.ProductDiscount.repository.ProductRepo;
import com.example.ProductDiscount.response.ProductFinalPriceResponse;
import com.example.ProductDiscount.response.ProductResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductFinalPriceResponse> getDiscountedProducts() {
     List<Product> products = productRepo.findAll();
       return products.stream()
                .map(product -> {
                    double finalPrice = product.getCost() - (product.getCost() * ((double) product.getDiscount() / 100));
                    return new ProductFinalPriceResponse(product.getPname(), finalPrice);
                })
                .collect(Collectors.toList());
    }
}
