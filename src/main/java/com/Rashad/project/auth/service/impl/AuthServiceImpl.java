package com.Rashad.project.auth.service.impl;

import com.Rashad.project.auth.dto.login.LoginReq;
import com.Rashad.project.auth.dto.login.LoginRes;
import com.Rashad.project.auth.dto.registration.RegistrationRes;
import com.Rashad.project.auth.dto.registration.RegistrationReq;
import com.Rashad.project.auth.exception.EmailAlreadyExistsException;
import com.Rashad.project.auth.exception.UserNotFoundException;
import com.Rashad.project.auth.exception.UsernameAlreadyExists;
import com.Rashad.project.user.entity.User;
import com.Rashad.project.user.repository.UserRepository;
import com.Rashad.project.auth.security.PasswordConfig;
import com.Rashad.project.auth.service.AuthService;
import jakarta.validation.Valid;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;
    private PasswordConfig passwordConfig;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository, PasswordConfig passwordConfig) {
        this.userRepository = userRepository;
        this.passwordConfig = passwordConfig;
    }

    /// Registration User
    @Override
    public RegistrationRes createUser(@Valid RegistrationReq userReq) {
        if (userRepository.existsByUserName(userReq.getUserName())) {
            throw new UsernameAlreadyExists(userReq.getUserName());
        }
        if (userRepository.existsByUserEmail(userReq.getUserEmail())) {
            throw new EmailAlreadyExistsException(userReq.getUserEmail());
        }

        User user = User.builder()
                .userName(userReq.getUserName())
                .userEmail(userReq.getUserEmail())
                .userPassword(passwordConfig.passwordEncoder().encode(userReq.getUserPassword()))
                .build();
        userRepository.save(user);
        return new RegistrationRes(user.getUID(), user.getUserName());
    }

    /// Login User
//    public Optional<LoginRes> loginUser(@Valid LoginReq loginData) {
//        User user =
//                userRepository.findByUserNameOrUserEmail(
//                        loginData.getNameOrEmail(),
//                        loginData.getNameOrEmail()
//                ).orElseThrow(() -> new UserNotFoundException());
//    }
}