package com.diandi.user.dao;

import com.diandi.user.entity.NewsFunction;

import java.util.List;

public interface NewsFunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsFunction record);

    int insertSelective(NewsFunction record);

    List<NewsFunction> selectByExample(NewsFunctionExample example);

    NewsFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsFunction record);

    int updateByPrimaryKey(NewsFunction record);
}