package com.Rashad.project.auth.repository;

import com.Rashad.project.auth.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
     Optional<RefreshToken> findByRefreshToken(String refreshToken);
}