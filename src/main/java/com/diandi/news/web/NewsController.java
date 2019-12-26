package com.diandi.news.web;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.News;
import com.diandi.news.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-15 11:29
 **/
@Api(value = "实现新闻的CURD",tags = "实现新闻的CURD")
@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "实现信息查询分页",notes = "实现信息查询分页")
    @GetMapping("/api/news/newspage.do")
    public D page(NewsQueryDto queryDto) {
        return newsService.queryPage(queryDto);
    }

    @ApiOperation(value = "实现新闻的添加",notes = "实现新闻的添加")
    @PostMapping("/api/news/newsadd.do")
    public D newsadd(@RequestBody News news) {
        return newsService.insert(news);
    }

    @ApiOperation(value = "根据新闻id实现信息的删除",notes = "根据新闻id实现信息的删除")
    @DeleteMapping("/api/news/newsdelete.do")
    public D delete(Integer id) {
        return newsService.delete(id);
    }

    @ApiOperation(value = "根据新闻id实现信息的详细信息评论",notes = "根据新闻id实现信息的详细信息评论")
    @GetMapping("/api/news/newsInfo.do")
    public D newsInfo(Integer id) {
        return newsService.info(id);
    }

    @ApiOperation(value = "删除评论",notes="删除评论")
    @DeleteMapping("/api/news/deleteComment.do")
    public D deleteComment(@RequestBody Integer commentId,Integer userId) {
        return newsService.deleteComment(commentId, userId);
    }

}
