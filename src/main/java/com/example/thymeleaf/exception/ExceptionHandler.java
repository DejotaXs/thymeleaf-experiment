package com.example.thymeleaf.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler {
    private ErrorMessage getErrorMessage(Exception ex, WebRequest webRequest, HttpStatus httpStatus) {
        log.error("Exception occurred: {}", ex.getMessage());
        return ErrorMessage.builder()
                .statusCode(httpStatus.value())
                .timestamp(LocalDate.now())
                .message(ex.getMessage())
                .description(webRequest.getDescription(false))
                .build();
    }
}
