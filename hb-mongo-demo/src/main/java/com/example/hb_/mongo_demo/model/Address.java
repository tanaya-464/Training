package com.example.hb_.mongo_demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Address {
    private String city;
    private String state;
    private String pincode;

}
