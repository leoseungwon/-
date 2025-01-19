package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class ArticleComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
    public ArticleComment(String content, User user) {}
}
