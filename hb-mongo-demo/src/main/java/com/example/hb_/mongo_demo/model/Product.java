package com.example.hb_.mongo_demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Product {
    private String prname;
    private int qty;
    private int price;


}