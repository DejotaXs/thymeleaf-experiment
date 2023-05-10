package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.PubSubInboundMessage;
import com.example.thymeleaf.service.InboundMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/messages/inbound")
@RequiredArgsConstructor
public class InboundMessageController {
    private final InboundMessageService inboundMessageService;

    @GetMapping
    public List<PubSubInboundMessage> findAll(){
        log.info("Returning all inbound messages");
        return inboundMessageService.findAll();
    }
}
