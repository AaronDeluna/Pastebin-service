package com.example.pastebinservicefinal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/comment")
@RequiredArgsConstructor
public class CommentController {

    @PostMapping
    public ResponseEntity<?> addComment(){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteComment(){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getComments(){
        return ResponseEntity.ok().build();
    }
}
