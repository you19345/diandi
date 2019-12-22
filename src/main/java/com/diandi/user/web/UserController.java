package com.diandi.user.web;

import com.diandi.common.vo.D;
import com.diandi.user.entity.User;
import com.diandi.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-21 16:30
 **/
@Api(value = "用户的相关操作")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户的登录验证")
    @PostMapping("api/user/login")
    public D login(User user) {
        return D.OK(userService.login(user));
    }
}
