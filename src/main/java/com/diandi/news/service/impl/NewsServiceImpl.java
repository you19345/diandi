package com.diandi.news.service.impl;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.dao.NewsMapper;
import com.diandi.news.entity.News;
import com.diandi.news.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-15 10:56
 **/
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public D insert(News news) {
        if (newsMapper.insert(news) > 0) {
            return D.OK();
        } else {
            return D.fail();
        }

    }

    @Override
    public D queryById(Integer id) {
        return D.OK(newsMapper.selectByPrimaryKey(id));
    }

    @Override
    public D queryPage(NewsQueryDto queryDto) {
        if (queryDto.getContent() != null) {
            queryDto.setContent(queryDto.getContent()+"%");
        }
//        设置分页
        PageHelper.startPage(queryDto.getPage(),queryDto.getSize());
        List<News> list = newsMapper.selectAll(queryDto);
        PageInfo<News> pageInfo = new PageInfo<>(list);
        return D.OK(pageInfo);
    }

    @Override
    public D delete(Integer id) {
        if (newsMapper.deleteByPrimaryKey(id) > 0) {
            return D.OK();
        } else {
            return D.fail();
        }
    }

    @Override
    public D update(News news) {
        if (newsMapper.updateByPrimaryKeySelective(news)  > 0) {
            return D.OK();
        } else {
            return D.fail();
        }
    }
}
