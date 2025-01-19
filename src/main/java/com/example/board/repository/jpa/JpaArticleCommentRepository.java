package com.example.board.repository.jpa;

import com.example.board.entity.ArticleComment;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
