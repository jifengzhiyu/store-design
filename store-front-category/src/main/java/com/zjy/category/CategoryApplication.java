package com.zjy.category;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author kaixin
 * @ClassName CategoryApplication
 * @Description 类别
 * @Version 1.0
 * @since 2023/6/4 00:35
 */

@MapperScan(basePackages = "com.zjy.category.mapper")
@SpringBootApplication
public class CategoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class,args);
    }

    //新的分页插件，一缓和二缓遵循mybatis的规则，
    // 需要设置MybatisConfiguration#useDeprecatedExecutor=false避免缓
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
