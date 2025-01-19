package com.example.board.application.interfaces;

import com.example.board.entity.Article;
import com.example.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository {
    User findByUserId(String userId);

    User save(User user);

    void delete(User user);

}
