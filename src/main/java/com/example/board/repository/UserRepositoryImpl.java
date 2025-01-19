package com.example.board.repository;

import com.example.board.application.interfaces.UserRepository;
import com.example.board.entity.User;
import com.example.board.repository.jpa.JpaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final JpaUserRepository jpaUserRepository;

    @Override
    public User findByUserId(String userId) {
        return jpaUserRepository.findByUserId(userId);
    }

    @Override
    public User save(User user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public void delete(User user) {
        jpaUserRepository.delete(user);
    }
}
