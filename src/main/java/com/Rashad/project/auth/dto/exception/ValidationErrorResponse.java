package com.Rashad.project.auth.dto.exception;

import java.time.Instant;
import java.util.Map;

public record ValidationErrorResponse(
        int status,
        String message,
        Map<String,String> errors,
        Instant instant
){}