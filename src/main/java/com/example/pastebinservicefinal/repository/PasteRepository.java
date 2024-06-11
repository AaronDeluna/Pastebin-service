package com.example.pastebinservicefinal.repository;

import com.example.pastebinservicefinal.entity.Paste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasteRepository extends JpaRepository<Paste, Integer> {
    Paste findByTitle(String pasteTitle);
}
