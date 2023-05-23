package com.example.thymeleaf.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
