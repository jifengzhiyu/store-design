package com.zjy.category.controller;

import com.zjy.category.service.CategoryService;
import com.zjy.utils.R;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixin
 * @ClassName CategoryController
 * @Description 类别
 * @Version 1.0
 * @since 2023/6/5 00:19
 */

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/promo/{categoryName}")
    public R byName(@PathVariable String categoryName){
        if (StringUtils.isEmpty(categoryName)){
            return R.fail("类别名称为null,无法查询类别数据");
        }
        return categoryService.byName(categoryName);
    }
}
