package com.Rashad.project.auth.controller;

import com.Rashad.project.auth.dto.login.LoginReq;
import com.Rashad.project.auth.dto.login.LoginRes;
import com.Rashad.project.auth.dto.registration.RegistrationReq;
import com.Rashad.project.auth.dto.registration.RegistrationRes;
import com.Rashad.project.auth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    /// REGISTRATION START ///
    //Creating User
    @PostMapping("/auth/registration")
    public ResponseEntity<RegistrationRes> registration(@Valid @RequestBody RegistrationReq user) {
        return ResponseEntity.ok(authService.createUser(user));
    }

    /// REGISTRATION END ///

    /// LOGIN START ///
//    @PostMapping("/auth/login")
//    public ResponseEntity<LoginRes> login(@Valid @RequestBody LoginReq user) {
//        return authService.
//    }

    /// LOGIN END ///
}