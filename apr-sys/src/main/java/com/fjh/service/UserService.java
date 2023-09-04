package com.fjh.service;

import com.fjh.entity.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int addUser(UserDto userDto);
}
