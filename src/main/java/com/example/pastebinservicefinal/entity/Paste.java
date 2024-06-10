package com.example.pastebinservicefinal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @NotEmpty
    private String url;

    @NotNull
    private Long expiryDate;

    @NotNull
    private Boolean isPublic;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
}
