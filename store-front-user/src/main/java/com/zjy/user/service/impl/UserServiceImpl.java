package com.zjy.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.param.UserCheckParam;
import com.zjy.pojo.User;
import com.zjy.user.mapper.UserMapper;
import com.zjy.user.service.UserService;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaixin
 * @ClassName UserServiceImpl
 * @Description 用户业务实现类
 * @Version 1.0
 * @since 2023/5/30 00:07
 */

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * @return com.zjy.utils.R 检查结果001 004
     * @description 检查账号是否可用业务
     * @author kaixin
     * @date 2023/5/30 00:04
     * @param    userCheckParam    账号参数已经校验完毕
     */
    @Override
    public R check(UserCheckParam userCheckParam) {
        //参数封装
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",userCheckParam.getUserName());
        //数据库查询
        Long total = userMapper.selectCount(queryWrapper);
        //查询结果处理
        if(total == 0){
            log.info("UserServiceImpl.check业务结束，结果：{}","账号可以使用！");
            return R.ok("账号不存在，可以使用！");
        }

        log.info("UserServiceImpl.check业务结束，结果：{}","账号不可使用！");
        return R.fail("账号已经存在，不可注册！");
    }
}
