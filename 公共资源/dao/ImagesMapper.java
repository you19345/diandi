package com.diandi.user.dao;

import com.diandi.user.entity.Images;

import java.util.List;

public interface ImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Images record);

    int insertSelective(Images record);

    List<Images> selectByExample(ImagesExample example);

    Images selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}