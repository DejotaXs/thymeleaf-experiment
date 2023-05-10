package com.example.thymeleaf.service;

import com.example.thymeleaf.model.PubSubInboundMessage;
import com.example.thymeleaf.repository.InboundMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InboundMessageService {
    private final InboundMessageRepository inboundMessageRepository;

    public List<PubSubInboundMessage> findAll() {
        return inboundMessageRepository.findAll();
    }
}
