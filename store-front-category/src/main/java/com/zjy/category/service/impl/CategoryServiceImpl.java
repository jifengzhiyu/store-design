package com.zjy.category.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.category.mapper.CategoryMapper;
import com.zjy.category.service.CategoryService;
import com.zjy.param.ProductHotParam;
import com.zjy.pojo.Category;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * @return com.zjy.utils.R
     * @description 根据传入的热门类别名称集合！返回类别对应的id集合
     * @author kaixin
     * @date 2023/6/5 22:42
     * @param    productHotParam
     */
    @Override
    public R hotsCategory(ProductHotParam productHotParam) {

        QueryWrapper<Category> queryWrapper = new QueryWrapper<>();

        queryWrapper.in("category_name",productHotParam.getCategoryName());

        queryWrapper.select("category_id");

        List<Object> ids = categoryMapper.selectObjs(queryWrapper);

        R ok = R.ok("类别集合查询成功", ids);
        log.info("CategoryServiceImpl.hotsCategory!业务结束，结果：{}",ok);

        return ok;
    }

    /**
     * @return com.zjy.utils.R
     * @description 查询类别数据，进行返回！
     * @author kaixin
     * @date 2023/6/9 23:39
     */
    @Override
    public R list() {
        List<Category> categoryList = categoryMapper.selectList(null);
        R ok = R.ok("类别全部数据查询成功！", categoryList);
        log.info("CategoryServiceImpl.list业务结束，结果：{}",ok);
        return ok;
    }
}
