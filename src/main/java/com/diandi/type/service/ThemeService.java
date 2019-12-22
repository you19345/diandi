package com.diandi.type.service;

import com.diandi.common.vo.D;
import com.diandi.type.entity.Theme;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-18 20:35
 **/
public interface ThemeService {
    D selectAll();

    D insert(Theme theme);

    D delete(Integer id);

    D update(Theme theme);

    D selectById(Integer id);
}
