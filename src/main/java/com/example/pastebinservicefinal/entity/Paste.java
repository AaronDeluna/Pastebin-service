package com.example.pastebinservicefinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pastes")
@AllArgsConstructor
@NoArgsConstructor
public class Paste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String url;

    private Long expiryDate;

    private Boolean isPublic;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
}
