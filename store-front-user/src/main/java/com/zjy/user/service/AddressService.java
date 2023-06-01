package com.zjy.user.service;

import com.zjy.pojo.Address;
import com.zjy.utils.R;

/**
 * @author kaixin
 * @ClassName AddressService
 * @Description 地址
 * @Version 1.0
 * @since 2023/6/1 16:24
 */
public interface AddressService {
    
    /**
     * @description  根据用户id查询地址数据！
     * @author  kaixin
     * @date    2023/6/1 16:24
     * @param	userId	用户id已经校验完毕
     * @return  com.zjy.utils.R
    */
    R list(Integer userId);

    /**
     * @description  插入地址数据，并返回
     * @author  kaixin
     * @date    2023/6/1 16:46
     * @param	address 地址数据已经校验完毕
     * @return  com.zjy.utils.R
    */
    R save(Address address);

    /**
     * @description  根据id删除地址
     * @author  kaixin
     * @date    2023/6/1 16:54
     * @param	id	
     * @return  com.zjy.utils.R
    */
    R remove(Integer id);
}
