package com.example.board.repository;

import com.example.board.application.interfaces.ArticleCommentRepository;
import com.example.board.application.interfaces.ArticleRepository;
import com.example.board.entity.Article;
import com.example.board.entity.ArticleComment;
import com.example.board.repository.jpa.JpaArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ArticleRepositoryImpl implements ArticleRepository {

    private JpaArticleRepository jpaArticleRepository;


    @Override
    public List<Article> findByUserId(String userId) {
        return jpaArticleRepository.findAll().stream().toList();
    }

    @Override
    public Article save(Article article) {
        return jpaArticleRepository.save(article);
    }

    @Override
    public Article findById(Long id) {
        return jpaArticleRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Long articleId) {
        jpaArticleRepository.deleteById(articleId);
    }
}
