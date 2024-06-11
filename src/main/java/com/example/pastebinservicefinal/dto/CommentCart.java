package com.example.pastebinservicefinal.dto;

import com.example.pastebinservicefinal.entity.Paste;
import com.example.pastebinservicefinal.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CommentCart {

    @NotEmpty
    private String content;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "paste_id")
    private Paste paste;
}
