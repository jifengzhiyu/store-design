package com.zjy.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author kaixin
 * @ClassName ProductHotParam
 * @Description 热门商品
 * @Version 1.0
 * @since 2023/6/5 22:38
 */

@Data
public class ProductHotParam {

    @NotEmpty
    private List<String> categoryName;
}
