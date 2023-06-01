package com.zjy.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author kaixin
 * @ClassName AddressRemoveParam
 * @Description 地址移除
 * @Version 1.0
 * @since 2023/6/1 16:51
 */

@Data
public class AddressRemoveParam {

    @NotNull
    private Integer id;
}
