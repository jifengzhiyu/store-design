package com.zjy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    //jackson的注解，用于进行属性格式化！
    @JsonProperty("user_id")
    @TableId(type = IdType.AUTO)
    private Integer userId;

    @Length(min = 6)
    private String userName;

    //忽略属性不生成json不接受json数据aJsonIgnore
    //@JsonInclude(JsonInclude.Include.NON_NULL)+null
    // 当，这个值不为null的时候生成json,为null不生成
    // 不影响接收json
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String userPhonenumber;
}
