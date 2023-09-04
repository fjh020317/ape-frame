package com.fjh.controller;

import com.fjh.entity.dto.UserDto;
import com.fjh.entity.po.UserPo;
import com.fjh.entity.req.UserReq;
import com.fjh.mapper.UserMapper;
import com.fjh.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
    @PostMapping()
    public int addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        return userService.addUser(userDto);
    }
}
