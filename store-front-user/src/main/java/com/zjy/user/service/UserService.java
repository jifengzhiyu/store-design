package com.zjy.user.service;

import com.zjy.param.UserCheckParam;
import com.zjy.utils.R;

/**
 * @author kaixin
 * @ClassName UserService
 * @Description
 * @Version 1.0
 * @since 2023/5/30 00:02
 */
public interface UserService {

    /**
     * @description  检查账号是否可用业务
     * @author  kaixin
     * @date    2023/5/30 00:04
     * @param	userCheckParam	账号参数已经校验完毕
     * @return  com.zjy.utils.R 检查结果001 004
    */
    R check(UserCheckParam userCheckParam);
}
