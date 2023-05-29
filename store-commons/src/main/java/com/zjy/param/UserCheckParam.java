package com.zjy.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author kaixin
 * @ClassName UserCheckParam
 * @Description 接收前端参数
 * @Version 1.0
 * @since 2023/5/29 22:45
 * TODO: 要使用jsr303的注解进行参数校验！
 * @NotBlank 字符串不能为nul1和空字符串
 * @NotNull 字符串不能为null
 * @NotEmpty 集合类型集合长度不能为0
 */

@Data
public class UserCheckParam {

    //注意：参数名称要等于前端传递的JSON key的名称！
    @NotBlank
    private String userName;

}
