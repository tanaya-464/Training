package com.example.hb_.mongo_demo.repository;

import com.example.hb_.mongo_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface shoppingRepo extends MongoRepository<User,Integer> {

    List<User> findByName(String name);

    @Query("{'Address.state':?0}")
    List<User> findByCity(String city);

    @Query("{ 'id': ?0 }")
    User findById(String id);


}

