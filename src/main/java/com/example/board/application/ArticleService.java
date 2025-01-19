package com.example.board.application;

import com.example.board.application.interfaces.ArticleRepository;
import com.example.board.application.interfaces.UserRepository;
import com.example.board.dto.ArticleDto;
import com.example.board.dto.UserDto;
import com.example.board.entity.Article;
import com.example.board.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final UserRepository userRepository;

    public Article createArticle(ArticleDto articleDto, UserDto userDto) {
        User user = userRepository.findByUserId(userDto.id());
        Article article = new Article(articleDto.title(), articleDto.content(), user);
        user.addArticle(article);
        return articleRepository.save(article);
    }
}
