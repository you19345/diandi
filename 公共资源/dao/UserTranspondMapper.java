package com.diandi.user.dao;

import com.diandi.user.entity.UserTranspond;

import java.util.List;

public interface UserTranspondMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTranspond record);

    int insertSelective(UserTranspond record);

    List<UserTranspond> selectByExample(UserTranspondExample example);

    UserTranspond selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTranspond record);

    int updateByPrimaryKey(UserTranspond record);
}