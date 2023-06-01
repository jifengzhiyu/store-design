package com.zjy.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author kaixin
 * @ClassName AddressListParam
 * @Description 地址集合参数
 * @Version 1.0
 * @since 2023/6/1 16:17
 */

@Data
public class AddressListParam {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId;
}
