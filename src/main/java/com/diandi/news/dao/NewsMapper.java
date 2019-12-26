package com.diandi.news.dao;

import com.diandi.dto.NewsInfoDto;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.Comment;
import com.diandi.news.entity.News;
import com.diandi.news.entity.UserNews;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    News selectByPrimaryKey(Integer id);

    List<News> selectAll(NewsQueryDto queryDto);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<NewsInfoDto> selectInfo(Integer id);

    //查找文章评论
    List<Comment> selectComment(Integer id);

    //  删除评论
    int deleteComment(@Param("commentId") Integer commentId, @Param("userId") Integer userId);

    //    插入新闻时，用户和新闻的关联表
    int insertUserNews(UserNews userNews);

    //    删除新闻时，用户和新闻的关联表
    int deltetUserNews(Integer newsId);


}