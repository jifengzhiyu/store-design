package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author kaixin
 * @ClassName Category
 * @Description 类别
 * @Version 1.0
 * @since 2023/6/5 00:15
 */

@Data
@TableName("category")
public class Category {
    @TableId(type = IdType.AUTO)
    private Integer categoryId;

    private String categoryName;
}
