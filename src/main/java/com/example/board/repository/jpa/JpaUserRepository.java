package com.example.board.repository.jpa;

import com.example.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

    User findByUserId(String userId);
}
