package com.example.board.repository.jpa;

import com.example.board.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaArticleRepository extends JpaRepository<Article, Long> {
}
