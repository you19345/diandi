package com.diandi.news.service;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsInfoDto;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.News;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @program: diandi
 * @description: 新闻curd
 * @author: You毒
 * @create: 2019-12-15 10:45
 **/
public interface NewsService {
    //    新增
    D insert(News news);

    //根据id查询
    D queryById(Integer id);

    //    分页查询
    D queryPage(NewsQueryDto queryDto);

    //    删除
    D delete(Integer id);

    //    更新
    D update(News news);

    D selectInfo(Integer id);

    //    新闻详情及评论
    D info(Integer id);

    // 删除评论
    D deleteComment(Integer commentId, Integer userId);
}
