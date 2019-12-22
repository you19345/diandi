package com.diandi.type.service.impl;

import com.diandi.common.vo.D;
import com.diandi.type.dao.ThemeMapper;
import com.diandi.type.entity.Theme;
import com.diandi.type.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-18 20:38
 **/
@Service
public class ThemeServiceImpl implements ThemeService {
    @Autowired
    public ThemeMapper themeMapper;

    @Override
    public D selectAll() {
        return D.OK(themeMapper.selectAll());
    }

    @Override
    public D insert(Theme theme) {
        if (themeMapper.insert(theme)> 0) {
            return D.OK();
        }
        return D.fail();
    }

    @Override
    public D update(Theme theme) {
        if (themeMapper.update(theme)> 0) {
            return D.OK();
        }
        return D.fail();
    }

    @Override
    public D selectById(Integer id) {
        return D.OK(themeMapper.selectById(id));
    }

    @Override
    public D delete(Integer id) {
        if (themeMapper.delete(id)> 0) {
            return D.OK();
        }
        return D.fail();
    }

}
