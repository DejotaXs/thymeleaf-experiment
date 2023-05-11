package com.example.thymeleaf.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
