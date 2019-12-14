package com.diandi.user.dao;

import com.diandi.user.entity.ThemeNews;

import java.util.List;

public interface ThemeNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ThemeNews record);

    int insertSelective(ThemeNews record);

    List<ThemeNews> selectByExample(ThemeNewsExample example);

    ThemeNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThemeNews record);

    int updateByPrimaryKey(ThemeNews record);
}