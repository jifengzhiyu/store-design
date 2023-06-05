package com.zjy.category.controller;

import com.zjy.category.service.CategoryService;
import com.zjy.param.ProductHotParam;
import com.zjy.utils.R;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    /**
     * @description: 热门ID
     * @author kaixin
     * @date 2023/6/5 22:41
     * @version 1.0
     */
    @PostMapping("hots")
    public R hotsCategory(@RequestBody @Validated ProductHotParam productHotParam, BindingResult result){
        if(result.hasErrors()){
            return R.fail("类别集合查询失败！");
        }
        return categoryService.hotsCategory(productHotParam);
    }


    @GetMapping("/promo/{categoryName}")
    public R byName(@PathVariable String categoryName){
        if (StringUtils.isEmpty(categoryName)){
            return R.fail("类别名称为null,无法查询类别数据");
        }
        return categoryService.byName(categoryName);
    }
}
