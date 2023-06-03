package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kaixin
 * @ClassName Carousel
 * @Description 轮播图
 * @Version 1.0
 * @since 2023/6/3 22:39
 */

@Data
@TableName("carousel")
public class Carousel implements Serializable {
    public static final Long serialVersionUID = 1L;

    @TableId(value = "carousel_id",type = IdType.AUTO)
    @JsonProperty("carousel_id")
    private Integer carouselId;

    @TableField("img_Path")
    private String imgPath;
    private String describes;

    @TableField("product_id")
    @JsonProperty("product_id")
    private Integer product;

    private Integer priority;
}
