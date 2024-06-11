package com.example.pastebinservicefinal.service;

import com.example.pastebinservicefinal.dto.PasteCart;
import com.example.pastebinservicefinal.entity.Paste;
import com.example.pastebinservicefinal.repository.PasteRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PasteService {

    @Autowired
    private PasteRepository pasteRepository;

    public void createPaste(PasteCart pasteCart){
        //TODO Если добавлять генирацию url и время жизни то тут
        Paste paste = new Paste();
        paste.setTitle(pasteCart.getTitle());
        paste.setContent(pasteCart.getContent());
        paste.setIsPublic(pasteCart.getIsPublic());
        pasteRepository.save(paste);
    }

    public List<Paste> getAllPaste(){
        return pasteRepository.findAll();
    }

    public void updatePasteById(Integer id, PasteCart pasteCart) {
        Paste existingPaste = pasteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Paste not found with id " + id));
        existingPaste.setTitle(pasteCart.getTitle());
        existingPaste.setContent(pasteCart.getContent());
        existingPaste.setIsPublic(pasteCart.getIsPublic());
        pasteRepository.save(existingPaste);
    }

    public void deletePaste(Integer id){
        pasteRepository.deleteById(id);
    }

    public Paste searchPastesByTitle(String pasteTitle){
        return pasteRepository.findByTitle(pasteTitle);
    }
}
