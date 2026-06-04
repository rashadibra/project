package com.Rashad.project.auth.service;

import com.Rashad.project.auth.dto.registration.RegistrationReq;
import com.Rashad.project.auth.dto.registration.RegistrationRes;

public interface AuthService {
public RegistrationRes createUser(RegistrationReq user);
}