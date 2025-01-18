package com.example.board.domain;


import java.time.LocalDateTime;

public class Article {
    private Long articleId;
    private String title;
    private String content;
    private User user;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


}
