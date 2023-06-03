package com.zjy.carousel.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.carousel.mapper.CarouselMapper;
import com.zjy.carousel.service.CarouselService;
import com.zjy.pojo.Carousel;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kaixin
 * @ClassName CarouselServiceImpl
 * @Description 轮播图
 * @Version 1.0
 * @since 2023/6/3 23:04
 */

@Service
@Slf4j
public class CarouselServiceImpl implements CarouselService {

//    @Autowired
    @Resource
    private CarouselMapper carouselMapper;

    /**
     * @return com.zjy.utils.R
     * @description 查询优先级最高的六条轮播图数据
     * @author kaixin
     * @date 2023/6/3 22:57
     */
    @Override
    public R list() {
        QueryWrapper<Carousel> carouselQueryWrapper = new QueryWrapper<>();
        carouselQueryWrapper.orderByDesc("priority");

        List<Carousel> list = carouselMapper.selectList(carouselQueryWrapper);

        //Stream方法
        List<Carousel> collect = list.stream().limit(6).collect(Collectors.toList());

        R ok = R.ok(collect);

        log.info("CarouselServiceImp.list业务结束，结果：{}",ok);

        return ok;
    }
}
