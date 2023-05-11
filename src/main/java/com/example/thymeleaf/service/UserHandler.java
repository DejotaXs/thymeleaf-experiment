package com.example.thymeleaf.service;

import com.example.thymeleaf.model.AppUser;
import com.example.thymeleaf.model.Role;

import java.util.List;

public interface UserHandler {
    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
