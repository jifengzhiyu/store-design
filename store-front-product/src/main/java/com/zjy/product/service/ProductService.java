package com.zjy.product.service;

import com.zjy.param.ProductHotParam;
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

    /**
     * @description  多类别热门商品查询根据类别名称集合！至多查询7条
     * @author  kaixin
     * @date    2023/6/5 22:55
     * @param	productHotParam 类别名称集合
     * @return  com.zjy.utils.R
    */
    R hots(ProductHotParam productHotParam);
}
