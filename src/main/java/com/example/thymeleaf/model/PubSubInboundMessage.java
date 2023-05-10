package com.example.thymeleaf.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@Table
@Entity
public class PubSubInboundMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String organization;
    private String location;
    private String userName;
    private String messageType;
    private String status;
    private boolean isMatched;
    private boolean isSuccessful; // suc or unsuc
    private boolean isDeleted;
    private Long errorId;
    private Long successId;
    private String keyField;
    private String messageId;

    @Lob
    private String messageBody;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDate createdAt;
}
