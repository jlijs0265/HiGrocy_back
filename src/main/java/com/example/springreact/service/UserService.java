package com.example.springreact.service;

import com.example.springreact.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUser(String userId);
    Iterable<UserEntity> getUserByAll();


}
