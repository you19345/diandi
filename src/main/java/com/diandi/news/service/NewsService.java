package com.diandi.news.service;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.News;

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
}
