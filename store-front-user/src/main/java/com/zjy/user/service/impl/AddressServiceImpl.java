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
import java.lang.management.LockInfo;
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

    /**
     * @return com.zjy.utils.R
     * @description 插入地址数据，并返回
     * @author kaixin
     * @date 2023/6/1 16:46
     * @param    address 地址数据已经校验完毕
     */
    @Override
    public R save(Address address) {
        //1.插入数据
        int rows = addressMapper.insert(address);
        //2.插入成功
        if(rows == 0){
            log.info("AddressServiceImpl.save业务结束，结果：{}","地址失败！");
            return R.fail("插入地址失败！");
        }

        //3.返回再次查询的
        return list(address.getUserId());
    }

    /**
     * @return com.zjy.utils.R
     * @description 根据id删除地址
     * @author kaixin
     * @date 2023/6/1 16:54
     * @param    id
     */
    @Override
    public R remove(Integer id) {
        int rows = addressMapper.deleteById(id);

        if (rows == 0){
            log.info("AddressserviceImpl.remove.业务结束，结果：{}","地址删除失败");
            return R.fail("删除地址数据失败！");
        }

        log.info("AddressserviceImpl,remove.业务结束，结果：{}","地址删除成功！");
        return R.ok("地址删除成功！");
    }
}
