package com.zjy.category.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.category.mapper.CategoryMapper;
import com.zjy.category.service.CategoryService;
import com.zjy.pojo.Category;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kaixin
 * @ClassName CategoryServiceImpl
 * @Description 类别
 * @Version 1.0
 * @since 2023/6/5 00:27
 */

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

//    @Autowired
    @Resource
    private CategoryMapper categoryMapper;

    /**
     * @param categoryName
     * @description: 根据类别名称，查询类别对象
     * @author kaixin
     * @date 2023/6/5 00:26
     * @version 1.0
     */
    @Override
    public R byName(String categoryName) {
        //封装查询参数
        QueryWrapper<Category> categoryQueryWrapper = new QueryWrapper<>();
        categoryQueryWrapper.eq("category_name",categoryName);

        Category category = categoryMapper.selectOne(categoryQueryWrapper);

        if(category == null){
            log.info("CategoryServiceImpl.byName.业务结束，结果：类别查询失败");
            return R.fail("类别查询失败");
        }

        log.info("CategoryServiceImpl.byName.业务结束，结果：{}","类别查询成功");
        return R.ok("类别查询成功",category);
    }
}
