package com.example.SecureApp.service;

import com.example.SecureApp.model.User;
import com.example.SecureApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
}
