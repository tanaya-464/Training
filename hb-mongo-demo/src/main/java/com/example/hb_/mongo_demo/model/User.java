package com.example.hb_.mongo_demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "order_db")
@AllArgsConstructor
@NoArgsConstructor
 public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> productList;
    private Address address;

}