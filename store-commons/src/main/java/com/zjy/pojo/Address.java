package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author kaixin
 * @ClassName Address
 * @Description 地址实体类
 * @Version 1.0
 * @since 2023/6/1 16:08
 */

@Data
@TableName("address")
public class Address implements Serializable {
    public static final Long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotBlank
    private String linkman;

    @NotBlank
    private String phone;

    @NotBlank
    private String address;

    @NotNull
    @TableField("user_id")
    private Integer userId;

}
