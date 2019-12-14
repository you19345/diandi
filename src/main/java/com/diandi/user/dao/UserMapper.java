package com.diandi.user.dao;

import com.diandi.user.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Double id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Double id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}