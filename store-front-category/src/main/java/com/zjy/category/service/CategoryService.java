package com.zjy.category.service;

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
}
