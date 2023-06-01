package com.zjy.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.pojo.Address;
import com.zjy.user.mapper.AddressMapper;
import com.zjy.user.service.AddressService;
import com.zjy.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kaixin
 * @ClassName AddressServiceImpl
 * @Description 地址
 * @Version 1.0
 * @since 2023/6/1 16:25
 */

@Service
@Slf4j
public class AddressServiceImpl implements AddressService {

//    @Autowired
    @Resource
    private AddressMapper addressMapper;

    /**
     * @return com.zjy.utils.R
     * @description 根据用户id查询地址数据！
     * @author kaixin
     * @date 2023/6/1 16:24
     * @param    userId    用户id已经校验完毕
     */
    @Override
    public R list(Integer userId) {
        //1,封装查询参数
        QueryWrapper<Address> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        List<Address> addressList = addressMapper.selectList(queryWrapper);

        //2.结果封装
        R ok = R.ok("查询成功", addressList);
        log.info("AddressserviceImpl.list业务结束，结果：{}",ok);
        return ok;
    }
}
