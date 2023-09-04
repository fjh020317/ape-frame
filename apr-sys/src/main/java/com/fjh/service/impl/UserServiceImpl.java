package com.fjh.service.impl;

import com.fjh.entity.dto.UserDto;
import com.fjh.entity.po.UserPo;
import com.fjh.mapper.UserMapper;
import com.fjh.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        return userMapper.insert(userPo);
    }
}
