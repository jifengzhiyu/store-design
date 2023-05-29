package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kaixin
 * @ClassName User
 * @Description 用户的实体类
 * @Version 1.0
 * @since 2023/5/29 22:22
 */

@Data
@TableName("user")
public class User implements Serializable {
    public static final Long serialVersionUID = 1L;

    @TableId
    private Integer userId;
    private String userName;
    private String password;
    private String userPhonenumber;
}
