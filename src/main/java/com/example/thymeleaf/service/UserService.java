package com.example.thymeleaf.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserService{
    /*
    private final AppUserRepository appUserRepo;
    private final RoleRepository roleRepo;

    @Override
    public AppUser saveUser(AppUser appUser) {
        log.info("Saving new user [{}] to the db", appUser.getName());
        return appUserRepo.save(appUser);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role [{}] to the db", role.name());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding  role [{}] to User [{}] ", roleName, username);
        AppUser appUser = appUserRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        //appUser.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        return appUserRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return appUserRepo.findAll();
    }

     */
}
