package com.diandi.type.dao;


import com.diandi.type.entity.Theme;

import java.util.List;

public interface ThemeMapper {
    int insert(Theme record);

    int insertSelective(Theme record);

}