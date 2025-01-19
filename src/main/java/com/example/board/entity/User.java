package com.example.board.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Article> articles = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<ArticleComment> comments = new ArrayList<>();

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userName;

    public User(String id,String userName, String userPassword) {}


    public void addArticle(Article article) {
        this.articles.add(article);
        article.setUser(this);
    }

    public void addComment(ArticleComment comment) {
        this.comments.add(comment);
        comment.setUser(this);

    }
}
