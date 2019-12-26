package com.diandi.dto;

import com.diandi.news.entity.Comment;
import com.diandi.news.entity.News;
import lombok.Data;

import java.util.List;

/**
 * @program: diandi
 * @description: 新闻详情
 * @author: You毒
 * @create: 2019-12-23 17:52
 **/
@Data
public class NewsInfos {
    private News news;
    private List<Comment> comments;
    private long likes;
    private long collects;
    private long transpond;

}
