package com.Rashad.project.dto.exception;
import java.time.Instant;

public record ErrorResponse(
        int status,
        String message,
        Instant instant
) {}