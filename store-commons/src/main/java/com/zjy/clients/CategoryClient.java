package com.zjy.clients;

import com.zjy.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author kaixin
 * @ClassName CategoryClient
 * @Description 类别调用接口
 * @Version 1.0
 * @since 2023/6/5 00:35
 */

@FeignClient("category-service")
public interface CategoryClient {
    @GetMapping("/category/promo/{categoryName}")
    R byName(@PathVariable String categoryName);
}
