package com.diandi.user.dao;

import com.diandi.user.entity.UserLike;

import java.util.List;

public interface UserLikeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLike record);

    int insertSelective(UserLike record);

    List<UserLike> selectByExample(UserLikeExample example);

    UserLike selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLike record);

    int updateByPrimaryKey(UserLike record);
}