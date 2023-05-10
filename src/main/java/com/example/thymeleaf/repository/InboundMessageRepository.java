package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.PubSubInboundMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InboundMessageRepository extends JpaRepository<PubSubInboundMessage, Long> {
}
