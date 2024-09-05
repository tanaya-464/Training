package com.example.hb_.mongo_demo.controller;

import com.example.hb_.mongo_demo.repository.shoppingRepo;
import com.example.hb_.mongo_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.ListUI;
import java.util.List;

@RestController
@RequestMapping("/shopping-Service")
public class ShopController {
    @Autowired
    private shoppingRepo shoppingrepo;

    public ShopController(shoppingRepo shoppingRepo) {
        this.shoppingrepo = shoppingRepo;
    }

    @PostMapping("/orderPlace")
    private String placeOrder(@RequestBody User user) {
        shoppingrepo.save(user);
        return "Order placed successfully";

    }
    //also we can write above method as
    /*
    @PostMapping
    public ResponseEntity <User> saveOrUpdate(@RequestBody User user)
    return new ResponseEntity<User> (shoopingRepo.saveOrUpdate(user),HTTPStatus.ACCEPTED;

     }*/

    @GetMapping("/getUsersByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return shoppingrepo.findByName(name);
    }

    @GetMapping("/getUsersByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city) {
        return shoppingrepo.findByCity(city);
    }

    @PutMapping("/updateUserName/{id}")
    public ResponseEntity<String> updateUserName(@PathVariable String id, @RequestBody String newName) {
        User user = shoppingrepo.findById(id);
        if (user != null) {
            user.setName(newName);
            shoppingrepo.save(user);
            return ResponseEntity.ok("User name updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
