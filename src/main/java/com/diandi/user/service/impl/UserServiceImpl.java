package com.diandi.user.service.impl;

import com.diandi.user.dao.UserMapper;
import com.diandi.user.entity.User;
import com.diandi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-21 16:29
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
