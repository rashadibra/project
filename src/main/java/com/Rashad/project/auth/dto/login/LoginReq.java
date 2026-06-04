package com.Rashad.project.auth.dto.login;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginReq {
    @NotBlank(message = "İstifadəçi adı qeyd edin")
    private String NameOrEmail;
    @NotBlank(message = "Parol boş ola bilməz")
    private String userPassword;
}