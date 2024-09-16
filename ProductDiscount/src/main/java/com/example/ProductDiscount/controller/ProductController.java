package com.example.ProductDiscount.controller;

import com.example.ProductDiscount.model.Product;
import com.example.ProductDiscount.response.ProductFinalPriceResponse;
import com.example.ProductDiscount.response.ProductResponse;
import com.example.ProductDiscount.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductFinalPriceResponse> getAllProductsWithFinalPrice() {
        return productService.getDiscountedProducts();
    }
}
