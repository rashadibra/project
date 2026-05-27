package com.Rashad.project.controllers;

import com.Rashad.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin(origins = "http://localhost:5173")
@Controller
public class ProductController {
    @PostMapping("/registration")
    public void products(User user) {
        System.out.println("hello");
    };
}