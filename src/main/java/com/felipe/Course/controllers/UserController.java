package com.felipe.Course.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.felipe.Course.entities.User; // Make sure this path matches your User class location

@RestController
@RequestMapping("/users")
public class UserController{
    @GetMapping
    public ResponseEntity<User> findall() {
        User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
        return ResponseEntity.ok().body(u);
        
    }
}