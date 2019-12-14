package com.diandi.user.dao;

import com.diandi.user.entity.UserNews;

import java.util.List;

public interface UserNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserNews record);

    int insertSelective(UserNews record);

    List<UserNews> selectByExample(UserNewsExample example);

    UserNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserNews record);

    int updateByPrimaryKey(UserNews record);
}