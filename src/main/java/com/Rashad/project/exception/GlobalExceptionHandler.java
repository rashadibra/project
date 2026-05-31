package com.Rashad.project.exception;

import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntime(RuntimeException ex){
    ErrorResponse error=new ErrorResponse();
    error.setMessage(ex.getMessage());
    error.setStatus(ex.400);
}
@ExceptionHandler(BadRequestException.class)
   public ResponseEntity<ErrorResponse> handleBadRequest(BadRequestException ex){
    ErrorResponse error=new ErrorResponse();
    error.setMessage(ex.getMessage());
    error.setStatus();
}
}