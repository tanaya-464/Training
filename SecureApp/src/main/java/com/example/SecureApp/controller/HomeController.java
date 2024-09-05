package com.example.SecureApp.controller;

import com.example.SecureApp.model.User;
import com.example.SecureApp.repository.UserRepository;
import com.example.SecureApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
   // private UserService userService;
    private UserRepository userRepository;
    @RequestMapping("/")
    public String showSignupPage() {
        return "signup.jsp";
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return  userRepository.save(user);
    }
    @PostMapping("/signup")
    public ModelAndView handleSignup(
            @RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("confirm_password") String confirmPassword) {

        ModelAndView modelAndView = new ModelAndView();

        if (!password.equals(confirmPassword)) {
            modelAndView.setViewName("signup");
            modelAndView.addObject("error", "Passwords do not match.");
            return modelAndView;
        }

//        if (userService.findByUsername(username) != null) {
//            modelAndView.setViewName("signup");
//            modelAndView.addObject("error", "Username already exists.");
//            return modelAndView;
//        }

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

      //  userService.saveUser(user);

        modelAndView.setViewName("welcome");
        modelAndView.addObject("username", username);
        return modelAndView;
    }
}

