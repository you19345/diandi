package com.diandi.news.web;

import com.diandi.common.vo.D;
import com.diandi.dto.NewsQueryDto;
import com.diandi.news.entity.News;
import com.diandi.news.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-15 11:29
 **/
@Api(value = "实现新闻的CURD",tags = "实现新闻的CURD")
@RestController("/api/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "实现信息查询分页",notes = "实现信息查询分页")
    @GetMapping("/newspage.do")
    public D page(NewsQueryDto queryDto) {
        System.out.println(queryDto.getContent());
        return newsService.queryPage(queryDto);
    }

    @ApiOperation(value = "根据新闻id查询新闻详细信息",notes = "根据新闻id查询新闻详细信息")
    @GetMapping("/newsdetail")
    public D detail(Integer id) {
        return newsService.queryById(id);
    }

    @ApiOperation(value = "实现新闻的添加",notes = "实现新闻的添加")
    @PostMapping("/newsadd.do")
    public D newsadd(News news) {
        return newsService.insert(news);
    }

    @ApiOperation(value = "根据新闻id实现信息的删除",notes = "根据新闻id实现信息的删除")
    @DeleteMapping("/newsdelete.do")
    public D delete(Integer id) {
        return newsService.delete(id);
    }
}
