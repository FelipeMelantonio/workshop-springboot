package com.felipe.Course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.felipe.Course.entities.User;
import com.felipe.Course.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/insert")
    public ResponseEntity<User> insertUser() {
        User u = new User(null, "Maria", "maria@gmail.com", "99999999", "12345");
        User savedUser = userRepository.save(u);
        return ResponseEntity.ok().body(savedUser);
    }
}
