package com.example.pastebinservicefinal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<?> register(){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getUserProfile(){
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> updateUserProfile(){
        return ResponseEntity.ok().build();
    }

}
