package com.amalitech.lab1.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping("/user")
    String getUsers(){
        return "Helli";
    }
}
