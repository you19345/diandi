package com.diandi.type.dao;


import com.diandi.type.entity.Theme;

import java.util.List;

public interface ThemeMapper {
    int insert(Theme record);

    int delete(Integer id);

    int update(Theme theme);

    List<Theme> selectAll();

    Theme selectById(Integer id);

}