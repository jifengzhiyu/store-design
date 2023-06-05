package com.zjy.product.service;

import com.zjy.utils.R;

/**
 * @author kaixin
 * @ClassName ProductService
 * @Description 商品
 * @Version 1.0
 * @since 2023/6/5 00:43
 */
public interface ProductService {

    /**
     * @description: 单类别名称查询热门商品至多7条数据
     * @author kaixin
     * @date 2023/6/5 00:44
     * @version 1.0
     */
    R promo(String categoryName);
}
