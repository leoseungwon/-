package com.example.board.application;

import com.example.board.application.interfaces.UserRepository;
import com.example.board.dto.UserDto;
import com.example.board.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(UserDto userDto) {
        User user = new User(userDto.id(), userDto.userPassword(), userDto.username());
        return userRepository.save(user);
    }

}
