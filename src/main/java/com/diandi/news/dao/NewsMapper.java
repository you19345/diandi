package com.diandi.news.dao;

import com.diandi.news.entity.News;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Double id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Double id);

    int updateByPrimaryKeySelective(News record);


    int updateByPrimaryKey(News record);
}