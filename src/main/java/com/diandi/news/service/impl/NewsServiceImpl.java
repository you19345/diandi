package com.diandi.news.service.impl;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsInfos;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.dao.NewsMapper;
import com.diandi.news.entity.News;
import com.diandi.news.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public D insert(News news) {
        if (newsMapper.insert(news) > 0) {
//            newsMapper.insertUserNews()
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

    @Override
    public D selectInfo(Integer id) {
        return D.OK(newsMapper.selectInfo(id));
    }

    @Override
    public D info(Integer id) {
        NewsInfos newsInfos = new NewsInfos();
        newsInfos.setNews(newsMapper.selectByPrimaryKey(id));
        newsInfos.setComments(newsMapper.selectComment(id));
        return D.OK(newsInfos);
    }

    @Override
    public D deleteComment(Integer commentId, Integer userId) {
        if (userId != null) {
            if (newsMapper.deleteComment(commentId,userId)>0) {
                return D.OK();
            } else {
                return D.fail("你没有权限");
            }
        } else {
            return D.fail("请登录！！！");
        }

    }
}
