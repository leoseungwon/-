package com.example.board.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private String userId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Article> articles = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<ArticleComment> comments = new ArrayList<>();

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String username;

}
