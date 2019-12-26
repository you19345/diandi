package com.diandi.type.web;

import com.diandi.common.vo.D;
import com.diandi.type.entity.Theme;
import com.diandi.type.service.ThemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: diandi
 * @description:
 * @author: You毒
 * @create: 2019-12-18 20:41
 **/
@Api(value = "实现类型的CURD", tags = "实现类型的CURD")
@RestController
public class ThemeController {

    @Autowired
    public ThemeService themeService;

    @ApiOperation(value = "实现类型的查找", notes = "实现类型的查找")
    @GetMapping("api/theme/select")
    public D selectAll() {
        return themeService.selectAll();
    }

    @ApiOperation(value = "实现类型的添加", notes = "实现类型的添加")
    @PostMapping("api/theme/insert")
    public D insert(Theme theme) {
        return themeService.insert(theme);
    }

    @ApiOperation(value = "实现类型的更新", notes = "实现类型的更新")
    @PutMapping("api/theme/update")
    public D update(Theme theme) {
        return themeService.update(theme);
    }

    @ApiOperation(value = "实现类型的删除", notes = "实现类型的删除")
    @DeleteMapping("api/theme/delete")
    public D delete(Integer id) {
        return themeService.delete(id);
    }

    @ApiOperation(value = "实现类型的删除", notes = "实现类型的删除")
    @GetMapping("api/theme/selectid")
    public D selectById(Integer id) {
        return themeService.selectById(id);
    }
}
