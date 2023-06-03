package com.zjy.carousel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kaixin
 * @ClassName CarouselApplication
 * @Description 轮播图
 * @Version 1.0
 * @since 2023/6/3 22:27
 */

@MapperScan(basePackages = "com.zjy.carousel.mapper")
@SpringBootApplication
public class CarouselApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarouselApplication.class,args);
    }
}
