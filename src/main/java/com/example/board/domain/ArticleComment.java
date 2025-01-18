package com.example.board.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleComment {
    private Long commentId;
    private String content;
    private User user;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
