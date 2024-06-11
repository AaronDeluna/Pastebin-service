package com.example.pastebinservicefinal.repository;

import com.example.pastebinservicefinal.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
