package com.Rashad.project.auth.entity;

import com.Rashad.project.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "refresh_tokens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TID;
    @Column(unique = true, nullable = false)
    private String token;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = false)
    private Instant expiresAt;
    @OneToOne
    @JoinColumn(name = "UID",nullable = false)
    private User user;
}