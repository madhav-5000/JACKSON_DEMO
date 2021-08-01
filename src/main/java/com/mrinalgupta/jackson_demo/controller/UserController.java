package com.mrinalgupta.jackson_demo.controller;

import com.mrinalgupta.jackson_demo.domain.User;
import com.mrinalgupta.jackson_demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return (List<User>) userService.list();

    }
}
