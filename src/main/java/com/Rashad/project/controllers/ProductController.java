package com.Rashad.project.controllers;

import com.Rashad.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {
    @PostMapping("/registration")
    public void products(@RequestBody User user) {
        System.out.println(user.getUserEmail());
        System.out.println(22);
    };
}