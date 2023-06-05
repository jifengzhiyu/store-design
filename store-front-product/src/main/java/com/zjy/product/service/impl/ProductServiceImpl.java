package com.zjy.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.clients.CategoryClient;
import com.zjy.pojo.Category;
import com.zjy.pojo.Product;
import com.zjy.product.mapper.ProductMapper;
import com.zjy.product.service.ProductService;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author kaixin
 * @ClassName ProductServiceImpl
 * @Description 商品
 * @Version 1.0
 * @since 2023/6/5 00:45
 */

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

//    @Autowired
//引入feign客户端需要，在启动类添加配置注解
    @Resource
    private CategoryClient categoryClient;

    @Resource
    private ProductMapper productMapper;

    /**
     * @param categoryName
     * @description: 单类别名称查询热门商品至多7条数据
     * @author kaixin
     * @date 2023/6/5 00:44
     * @version 1.0
     */
    @Override
    public R promo(String categoryName) {

        R r = categoryClient.byName(categoryName);
        if (r.getCode().equals(R.FAIL_CODE)){
            log.info("ProductserviceImpl,promo.业务结束，结果：{}","类别查询失败");
            return r;
        }

        ///类别服务中data=category--feign {json.}---product服务LinkedHashMap jackson
//        Category category = (Category) r.getData();
        LinkedHashMap<String,Object> map = (LinkedHashMap<String, Object>) r.getData();

        Integer categoryId = (Integer) map.get("categoryId");

//        Integer categoryId = category.getCategoryId();

        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category_id",categoryId);
        queryWrapper.orderByDesc("product_sales");

        IPage<Product> page = new Page<>(1,7);

        page = productMapper.selectPage(page, queryWrapper);

        List<Product> productList = page.getRecords();

        log.info("ProductserviceImpl.promo业务结束，结果：{}",productList);

        return R.ok("数据查询成功",productList);
    }
}
