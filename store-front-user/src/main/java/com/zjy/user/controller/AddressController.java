package com.zjy.user.controller;

import com.zjy.param.AddressListParam;
import com.zjy.param.AddressRemoveParam;
import com.zjy.pojo.Address;
import com.zjy.user.service.AddressService;
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
 * @ClassName AddressController
 * @Description 地址
 * @Version 1.0
 * @since 2023/6/1 16:20
 */

@RestController
@RequestMapping("user/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/remove")
    public R remove(@RequestBody @Validated AddressRemoveParam addressRemoveParam, BindingResult result){
        if(result.hasErrors()){
            return R.ok("参数异常，删除失败！");
        }
        return addressService.remove(addressRemoveParam.getId());
    }

    @PostMapping("/save")
    public R save(@RequestBody @Validated Address address,BindingResult result){
        if(result.hasErrors()){
            return R.ok("参数异常，保存失败！");
        }
        return addressService.save(address);
    }

    @PostMapping("list")
    public R list(@RequestBody @Validated AddressListParam addressListParam, BindingResult result){
        if(result.hasErrors()){
            return R.ok("参数异常，查询失败！");
        }
        return addressService.list(addressListParam.getUserId());
    }
}
