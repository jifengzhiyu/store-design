package com.zjy.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author kaixin
 * @ClassName UserLoginParam
 * @Description 用户登陆参数
 * @Version 1.0
 * @since 2023/5/31 22:06
 */

@Data
public class UserLoginParam {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}
