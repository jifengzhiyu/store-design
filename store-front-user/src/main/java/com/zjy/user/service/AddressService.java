package com.zjy.user.service;

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
}