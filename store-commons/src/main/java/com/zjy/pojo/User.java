package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
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

    @TableId(type = IdType.AUTO)
    private Integer userId;

    @Length(min = 6)
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String userPhonenumber;
}
