package com.Rashad.project.user.repository;
import com.Rashad.project.user.entity.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public boolean existsByUserEmail(String email);
    public boolean existsByUserName(String name);
    public Optional<User> findByUserNameOrUserEmail(String Name, String Email);
}