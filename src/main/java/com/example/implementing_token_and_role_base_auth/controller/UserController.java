package com.example.implementing_token_and_role_base_auth.controller;

import com.example.implementing_token_and_role_base_auth.entity.User;
import com.example.implementing_token_and_role_base_auth.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers() {
        userService.initRolesAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin() {
        return "This url is only accessible to admin";
    }

    @GetMapping({"/forUser"})
    public String forUser() {
        return "This URL is only accessible to the user";
    }
}
