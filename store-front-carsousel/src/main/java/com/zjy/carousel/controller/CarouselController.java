package com.zjy.carousel.controller;

import com.zjy.carousel.service.CarouselService;
import com.zjy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixin
 * @ClassName Controller
 * @Description 轮播图
 * @Version 1.0
 * @since 2023/6/3 22:48
 */

@RestController
@RequestMapping("carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    /**
     * @description: 轮播图
     * @author kaixin
     * @date 2023/6/3 22:55
     * @version 1.0
     */
    @PostMapping("list")
    public R list(){
        return carouselService.list();
    }

}
