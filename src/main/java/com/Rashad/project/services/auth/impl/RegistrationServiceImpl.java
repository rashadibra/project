package com.Rashad.project.services.auth.impl;

import com.Rashad.project.dto.auth.RegistrationRes;
import com.Rashad.project.dto.auth.RegistrationReq;
import com.Rashad.project.model.User;
import com.Rashad.project.repositoryies.UserRepository;
import com.Rashad.project.services.auth.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationServiceImpl implements RegistrationService {
    private UserRepository userRepository;

    @Autowired
    public RegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegistrationRes createUser(RegistrationReq userReq) {
        User user = User.builder()
                .userName(userReq.getUserName())
                .userEmail(userReq.getUserEmail())
                .userPassword(userReq.getUserPassword())
                .build();
        try {
            User saved = userRepository.save(user);
            return new RegistrationRes(saved.getUID(), saved.getUserName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}