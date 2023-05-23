package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.PubSubInboundMessage;
import com.example.thymeleaf.service.InboundMessageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/home")
public class FrontEndController {

    private final InboundMessageService inboundMessageService;

    @GetMapping("/index")
    public ModelAndView list(@AuthenticationPrincipal UserDetails user){
        return new ModelAndView("list")
                .addObject("userName", user.getUsername())
                .addObject("messages", inboundMessageService.findAll());
    }
}
