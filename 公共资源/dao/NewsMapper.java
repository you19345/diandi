package com.diandi.user.dao;

import com.diandi.user.entity.News;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Double id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Double id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}