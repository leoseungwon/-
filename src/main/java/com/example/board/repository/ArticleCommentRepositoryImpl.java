package com.example.board.repository;

import com.example.board.application.interfaces.ArticleCommentRepository;
import com.example.board.entity.ArticleComment;
import com.example.board.repository.jpa.JpaArticleCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ArticleCommentRepositoryImpl implements ArticleCommentRepository {

    private final JpaArticleCommentRepository jpaArticleCommentRepository;

    @Override
    public ArticleComment findbyId(Long id) {
        return jpaArticleCommentRepository.findById(id).orElseThrow();

    }

    @Transactional
    @Override
    public ArticleComment save(ArticleComment articleComment) {
        return jpaArticleCommentRepository.save(articleComment);
    }

    @Transactional
    @Override
    public void delete(ArticleComment articleComment) {
        jpaArticleCommentRepository.delete(articleComment);
    }


}
