package com.example.pastebinservicefinal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/pastes")
@RequiredArgsConstructor
public class PasteController {

    @PostMapping
    public ResponseEntity<?> createPaste(){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getPaste(){
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> updatePaste(){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deletePaste(){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> searchPastes(){
        return ResponseEntity.ok().build();
    }
}
