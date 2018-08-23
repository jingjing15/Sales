package com.hh.service.Impl;


import com.hh.dao.UserMapper;
import com.hh.pojo.Users;
import com.hh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Users login(Users users) {
        return userMapper.login(users);
    }
}
