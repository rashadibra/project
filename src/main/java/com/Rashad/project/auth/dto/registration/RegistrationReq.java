package com.Rashad.project.auth.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationReq {
    @Pattern(regexp = "^[a-zA-Z0-9_]{3,16}$",
            message = "Kiçik hərflərə, böyük hərflərə, rəqəmlərə və alt xəttlərə icazə verilir. İstifadəçi adı 3 ilə 16 simvol arasında olmalıdır.")
    private String userName;
    @Email(message = "Email qeyd edin!")
    @NotBlank(message = "Email boş ola bilməz")
    private String userEmail;
    @NotBlank(message = "Parol boş ola bilməz")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\S{8,}$",
            message = "Parol ən azı 8 simvol olmalı, ən azı 1 böyük hərf, " +
                    "1 kiçik hərf və 1 rəqəm ehtiva etməli, boşluq simvolu olmamalıdır.")
    private String userPassword;
}