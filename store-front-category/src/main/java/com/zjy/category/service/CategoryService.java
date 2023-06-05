package com.zjy.category.service;

import com.zjy.param.ProductHotParam;
import com.zjy.utils.R;

/**
 * @author kaixin
 * @ClassName CategoryService
 * @Description 类别
 * @Version 1.0
 * @since 2023/6/5 00:22
 */
public interface CategoryService {

     /**
      * @description: 根据类别名称，查询类别对象
      * @author kaixin
      * @date 2023/6/5 00:26
      * @version 1.0
      */
     R byName(String categoryName);

     /**
      * @description  根据传入的热门类别名称集合！返回类别对应的id集合
      * @author  kaixin
      * @date    2023/6/5 22:42
      * @param	productHotParam	
      * @return  com.zjy.utils.R
     */
    R hotsCategory(ProductHotParam productHotParam);
}
