package com.example.thymeleaf.config;

import com.example.thymeleaf.model.AppUser;
import com.example.thymeleaf.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoderConfig passwordConfig;

    @Bean
    public UserDetailsService users() {
        List<UserDetails> userDetailsList = appUserRepository.findAll()
                .stream()
                .map(this::toUserDetails)
                .toList();

        return new InMemoryUserDetailsManager(userDetailsList);
    }

    private UserDetails toUserDetails(AppUser appUser) {
        return User.builder()
                .username(appUser.getUsername())
                .password(passwordConfig.getEnconder().encode(appUser.getPassword()))
                .roles(appUser.getRole().name())
                .build();
    }
}
