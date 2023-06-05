package com.zjy.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author kaixin
 * @ClassName ProductPromoParam
 * @Description 类别热门商品参数接收
 * @Version 1.0
 * @since 2023/6/4 23:58
 */

@Data
public class ProductPromoParam {
    @NotBlank
    private String categoryName;
}
