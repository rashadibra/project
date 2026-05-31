package com.Rashad.project.repositoryies;


import com.Rashad.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}