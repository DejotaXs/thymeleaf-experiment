package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "pub_sub_inbound_message")
public class PubSubInboundMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String location;

    @Column(name = "messageid")
    private String messageId;

    private String messageType;

    private String organisation;

    private String status;

    @Column(name = "\"user\"")
    private String user;

    private String createdAt;

    private Boolean deleted;

    @Column(name = "errorid")
    private Long errorId;

    private String keyField;

    private Boolean matched;

    @Column(name = "successid")
    private Long successId;

    private Boolean successful;

    private Boolean unsuccessful;

    @Lob
    private String messageBody;
}
