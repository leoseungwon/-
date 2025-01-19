package com.example.board.application;

import com.example.board.application.interfaces.ArticleCommentRepository;
import com.example.board.application.interfaces.ArticleRepository;
import com.example.board.application.interfaces.UserRepository;
import com.example.board.dto.ArticleCommentDto;
import com.example.board.dto.ArticleDto;
import com.example.board.dto.UserDto;
import com.example.board.entity.Article;
import com.example.board.entity.ArticleComment;
import com.example.board.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleCommentService {

    private final ArticleCommentRepository articleCommentRepository;
    private final ArticleRepository articleRepository;
    private final UserRepository userRepository;

    public ArticleComment createArticleComment(ArticleCommentDto articleCommentDto, UserDto userDto, ArticleDto articleDto) {
        User user = userRepository.findByUserId(userDto.id());
        Article article = articleRepository.findById(articleDto.id());
        ArticleComment articleComment = new ArticleComment(articleCommentDto.content(),user);
        return articleCommentRepository.save(articleComment);
    }

}
