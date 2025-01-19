package com.example.board.application.interfaces;

import com.example.board.entity.Article;
import com.example.board.entity.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository {
    List<Article> findByUserId(String userId);


    void deleteByCommentId(Long commentId);
}
