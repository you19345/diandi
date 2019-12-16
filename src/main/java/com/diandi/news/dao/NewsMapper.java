package com.diandi.news.dao;

import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    List<News> selectAll(NewsQueryDto queryDto);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}