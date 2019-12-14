package com.diandi.user.dao;

import com.diandi.user.entity.UserCollect;

import java.util.List;

public interface UserCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCollect record);

    int insertSelective(UserCollect record);

    List<UserCollect> selectByExample(UserCollectExample example);

    UserCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCollect record);

    int updateByPrimaryKey(UserCollect record);
}