package com.Rashad.project.dto.auth;

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
    @NotBlank(message = "Ad boş ola bilməz")
    @Size(min = 8, max = 50, message = "Ad 8-50 simvol olmalıdır")
    private String userName;
    @Email
    @NotBlank(message = "Email boş ola bilməz")
    private String userEmail;
    @NotBlank(message = "Parol boş ola bilməz")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Ən azı 8 simvol, 1 böyük hərf, 1 kiçik hərf, 1 rəqəm və 1 xüsusi simvol olmalıdır")
    private String userPassword;
}
