package com.zjy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kaixin
 * @ClassName com.zjy.user.UserApplication
 * @Description 用户服务的启动类
 * @Version 1.0
 * @since 2023/5/29 17:30
 */

@MapperScan(basePackages = "com.zjy.user.mapper")
@SpringBootApplication

public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
