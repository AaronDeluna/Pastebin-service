package com.example.pastebinservicefinal.controller;

import com.example.pastebinservicefinal.dto.PasteCart;
import com.example.pastebinservicefinal.entity.Paste;
import com.example.pastebinservicefinal.service.PasteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/pastes")
@RequiredArgsConstructor
public class PasteController {

    private final PasteService pasteService;

    @PostMapping
    public ResponseEntity<?> createPaste(@Valid @RequestBody PasteCart pasteCart){
        pasteService.createPaste(pasteCart);
        return ResponseEntity.ok("Paste успешно сохранен в базу данных!");
    }

    @GetMapping
    public List<Paste> getAllPaste(){
        return pasteService.getAllPaste();
    }

    @GetMapping("/search")
    public Paste searchPastesByTitle(@RequestParam String pasteTitle){
        return pasteService.searchPastesByTitle(pasteTitle);
    }

    @PutMapping
    public ResponseEntity<?> updatePasteById(@RequestBody Integer id, PasteCart pasteCart){
        pasteService.updatePasteById(id, pasteCart);
        return ResponseEntity.ok("Данные о пользователе успешно изменены!");
    }

    @DeleteMapping
    public ResponseEntity<?> deletePaste(@RequestParam Integer id){
        pasteService.deletePaste(id);
        return ResponseEntity.ok("Ваша заметка успешно удалена!");
    }
}
