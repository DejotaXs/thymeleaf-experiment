package com.example.thymeleaf.exception;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ErrorMessage(
        int statusCode,
        LocalDate timestamp,
        String message,
        String description) {
}
