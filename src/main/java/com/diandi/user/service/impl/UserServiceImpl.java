package com.diandi.user.service.impl;

import com.diandi.common.vo.D;
import com.diandi.config.SystemConfig;
import com.diandi.dto.UserLoginDto;
import com.diandi.user.dao.UserMapper;
import com.diandi.user.entity.User;
import com.diandi.user.service.UserService;
import com.diandi.util.EncryptUtil;
import com.diandi.util.TokenUtil;
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
    public D login(UserLoginDto loginDto) {
        User info= userMapper.login(loginDto.getTel());
        if (info!=null) {
            //密码比对
            if (info.getPassword().equals(EncryptUtil.aesenc(SystemConfig.PASS_KEY,loginDto.getPassword()))) {
//                登录成功
                String token = TokenUtil.createToken(info.getId(), info.getTel());
                return D.OK(token);
            }
        }
        return D.fail("用户名或密码错误，请重新输入");
    }

    @Override
    public D register(User user) {
        user.setPassword(EncryptUtil.aesenc(SystemConfig.PASS_KEY,user.getPassword()));
        return D.setD(userMapper.insert(user)>0 ? 200:400,"OK",null);
    }
}
