package com.diandi.user.service;

import com.diandi.common.vo.D;
import com.diandi.dto.UserLoginDto;
import com.diandi.user.entity.User;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-21 16:29
 **/
public interface UserService {
    D login(UserLoginDto loginDto);

    D register(User user);
}
