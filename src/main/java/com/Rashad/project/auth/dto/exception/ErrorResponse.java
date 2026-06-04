package com.Rashad.project.auth.dto.exception;

import java.time.Instant;

public record ErrorResponse(
        int status,
        String message,
        Instant instant
) {
}