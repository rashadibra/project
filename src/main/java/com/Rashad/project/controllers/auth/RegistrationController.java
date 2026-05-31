package com.Rashad.project.controllers.auth;

import com.Rashad.project.dto.auth.RegistrationReq;
import com.Rashad.project.services.auth.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private RegistrationService registrationService;
    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    //Creating User
    @PostMapping("/registration")
    public ResponseEntity<?> registration(@Valid @RequestBody RegistrationReq user) {
        return null;
    }
}
