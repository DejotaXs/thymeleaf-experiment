package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.AppUser;
import com.example.thymeleaf.model.PubSubInboundMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
