package com.Rashad.project.services.auth;

import com.Rashad.project.dto.auth.RegistrationReq;
import com.Rashad.project.dto.auth.RegistrationRes;
import com.Rashad.project.model.User;

public interface RegistrationService {
public RegistrationRes createUser(RegistrationReq user);
}