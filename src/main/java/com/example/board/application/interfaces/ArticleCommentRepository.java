package com.example.board.application.interfaces;

import com.example.board.entity.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleCommentRepository{
    ArticleComment findbyId(Long id);
    ArticleComment  save(ArticleComment articleComment);
    void delete(ArticleComment articleComment);


}
