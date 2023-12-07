package com.zjy.product.controller;

import com.zjy.param.ProductHotParam;
import com.zjy.param.ProductPromoParam;
import com.zjy.pojo.Product;
import com.zjy.product.service.ProductService;
import com.zjy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixin
 * @ClassName ProductController
 * @Description 商品
 * @Version 1.0
 * @since 2023/6/5 00:39
 */

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    

    @PostMapping("hots")
    public R hots(@RequestBody @Validated ProductHotParam productHotParam, BindingResult result){
        if (result.hasErrors()){
            return R.fail("数据查询失败！");
        }
        return productService.hots(productHotParam);
    }

    @PostMapping("/promo")
    public R promo(@RequestBody @Validated ProductPromoParam productPromoParam, BindingResult result){
        if (result.hasErrors()){
            return R.fail("数据查询失败！");
        }
        return productService.promo(productPromoParam.getCategoryName());
    }
}
