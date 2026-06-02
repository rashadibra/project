package com.Rashad.project.services.auth;

import com.Rashad.project.dto.auth.RegistrationReq;
import com.Rashad.project.dto.auth.RegistrationRes;

public interface RegistrationService {
public RegistrationRes createUser(RegistrationReq user);
}