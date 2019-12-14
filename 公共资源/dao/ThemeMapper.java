package com.diandi.user.dao;

import com.diandi.user.entity.Theme;

import java.util.List;

public interface ThemeMapper {
    int insert(Theme record);

    int insertSelective(Theme record);

    List<Theme> selectByExample(ThemeExample example);
}