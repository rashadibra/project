package com.Rashad.project.auth.service;

import com.Rashad.project.user.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Service
public class JwtService {
    @Value("${jwt.secret}")
    private String secret;

    public String generate

































































































































































































































    AccesToken(User user) {
        return Jwts.builder()
                .subject(user.getUserEmail())
                .issuedAt(new Date())
                .expiration(new Date(
                        System.currentTimeMillis() + 15 * 60 * 1000
                ))
                .signWith((Keys.hmacShaKeyFor(
                        secret.getBytes()
                )))
                .compact();

    }
}