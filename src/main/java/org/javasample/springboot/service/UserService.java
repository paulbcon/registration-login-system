package org.javasample.springboot.service;

import java.util.List;

import org.javasample.springboot.dto.UserDto;
import org.javasample.springboot.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
