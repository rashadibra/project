package com.Rashad.project.auth.exception;

public class UsernameAlreadyExists extends RuntimeException {
    public UsernameAlreadyExists(String name) {
        super("Username already exists: " + name);
    }
}