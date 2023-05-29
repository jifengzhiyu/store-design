package com.zjy.user.controller;

import com.zjy.param.UserCheckParam;
import com.zjy.user.service.UserService;
import com.zjy.user.service.UserService;
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
 * @ClassName UserController
 * @Description 用户模块控制器类
 * @Version 1.0
 * @since 2023/5/29 23:29
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userservice;

    /**
     * @description  
     * @author  kaixin
     * @date    2023/5/29 23:34
     * @param	userCheckParam 接收检查的账号实体 内部有参数校验注解
     * @param	result 获取校验结果的实体对象
     * @return  com.zjy.utils.R 返回封装结果R对象即可
    */
    @PostMapping("check")
    public R check(@RequestBody @Validated UserCheckParam userCheckParam, BindingResult result){
        //检查是否符合检验注解的规则 符合false不符合true
        boolean b = result.hasErrors();

        if(b){
            return R.fail("账号为null,不可使用！");
        }

        return userservice.check(userCheckParam);

    }
}
