package com.Rashad.project.exception;

import com.Rashad.project.dto.exception.ValidationErrorResponse;
import jakarta.validation.ValidationException;
import org.apache.coyote.BadRequestException;
import com.Rashad.project.dto.exception.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /// VALIDATION EXCEPTION
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorResponse> InvalidValidation(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach(error -> {
                    errors.put(error.getField(),
                            error.getDefaultMessage());
                });
return ResponseEntity.status(400).
        body(new ValidationErrorResponse(400,"Validation failed!",errors,Instant.now()));
    }

    /// BADREQUEST
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(BadRequestException ex) {
        ErrorResponse error = new ErrorResponse(400, ex.getMessage(), Instant.now());
        return ResponseEntity.status(400).body(error);
    }

    /// EMAIL ALREADY EXISTS
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleEmailAlreadyExists(EmailAlreadyExistsException ex) {
        ErrorResponse error = new ErrorResponse(409, ex.getMessage(), Instant.now());
        return ResponseEntity.status(409).body(error);
    }

    /// USER NOT FOUND
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(404, ex.getMessage(), Instant.now());
        return ResponseEntity.status(404).body(error);
    }


}