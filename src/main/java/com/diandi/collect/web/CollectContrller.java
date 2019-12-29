package com.diandi.collect.web;


import com.diandi.collect.entity.Collect;
import com.diandi.collect.service.CollectService;
import com.diandi.common.vo.D;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "实现收藏功能",tags = "实现收藏功能")
@RestController
public class CollectContrller {

    @Autowired
    private CollectService collectService;

    @ApiOperation(value = "实现收藏的添加",notes = "实现收藏的添加")
    @PostMapping("/collect/add.do")
    public D save(Collect collect) {
        return collectService.insert(collect);
    }


    @ApiOperation(value = "实现收藏的删除",notes = "实现收藏的删除")
    @DeleteMapping("/collect/delete.do")
    public D save(Integer id) {
        return collectService.deleteByCollectId(id);
    }

    @ApiOperation(value = "实现根据id查询文章",notes = "实现根据id查询文章")
    @GetMapping("/collect/query.do")
    public D query(Integer id) {
        return collectService.queryByCollectId(id);
    }




}
