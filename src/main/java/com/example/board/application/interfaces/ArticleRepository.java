package com.example.board.application.interfaces;

import com.example.board.entity.Article;

import java.util.List;

public interface ArticleRepository {
    List<Article> findByUserId(String userId);

    Article save(Article article);

    Article findById(Long id);

    void deleteById(Long articleId);
}
