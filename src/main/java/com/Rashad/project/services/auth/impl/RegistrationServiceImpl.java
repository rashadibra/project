package com.Rashad.project.services.auth.impl;

import com.Rashad.project.dto.auth.RegistrationRes;
import com.Rashad.project.dto.auth.RegistrationReq;
import com.Rashad.project.exception.EmailAlreadyExistsException;
import com.Rashad.project.model.User;
import com.Rashad.project.repositoryies.UserRepository;
import com.Rashad.project.services.auth.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    private UserRepository userRepository;

    @Autowired
    public RegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegistrationRes createUser(@Valid RegistrationReq userReq) {
        if(userRepository.existsByUserEmail(userReq.getUserEmail())){
            throw new EmailAlreadyExistsException(userReq.getUserEmail());
        }
        User user = User.builder()
                .userName(userReq.getUserName())
                .userEmail(userReq.getUserEmail())
                .userPassword(userReq.getUserPassword())
                .build();
        userRepository.save(user);
        return new RegistrationRes(user.getUID(), user.getUserName());
    }
}