package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kaixin
 * @ClassName Product
 * @Description 商品
 * @Version 1.0
 * @since 2023/6/5 00:00
 */

@Data
@TableName("product")
public class Product implements Serializable {
    public static final Long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @JsonProperty("product_id")
    private Integer productId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("category_id")
    private String categoryId;

    /***
     * 手机title
     */
    @JsonProperty("product_title")
    private String productTitle;

    /**
     * 手机信息描述
     */
    @JsonProperty("product_intro")
    private String productIntro;

    @JsonProperty("product_picture")
    private String productPicture;

    /*
    商品价格
     */
    @JsonProperty("product_price")
    private Double productPrice;

    @JsonProperty("product_selling_price")
    private Double productSellingPrice;

    @JsonProperty("product_num")
    private int productNum;

    @JsonProperty("product_sales")
    private int productSales;
}
