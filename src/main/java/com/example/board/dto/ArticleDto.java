package com.example.board.dto;

import com.example.board.entity.User;

public record ArticleDto(String title, String content, User uer) {
}
