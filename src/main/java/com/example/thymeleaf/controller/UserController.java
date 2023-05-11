package com.example.thymeleaf.controller;

import com.example.thymeleaf.dto.RoleToUserDto;
import com.example.thymeleaf.model.AppUser;
import com.example.thymeleaf.model.Role;
import com.example.thymeleaf.model.Task;
import com.example.thymeleaf.repository.TaskRepository;
import com.example.thymeleaf.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    /*

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> findUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }


    @PostMapping("/users")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser appUser){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(appUser));
    }

    @PostMapping("/roles")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping("/roles/addtouser")
    public ResponseEntity<?> addRoleRoUser(@RequestBody RoleToUserDto roleToUserDto) {
        userService.addRoleToUser(roleToUserDto.getUsername(), roleToUserDto.getRoleName());
        return ResponseEntity.ok().build();
    }

     */
}
