package com.Rashad.project.auth.dto.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRes {
    private Long UID;
    private String userName;
    private String userEmail;
    private boolean isEnabled;
}