package com.metajrs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("accountlist")
@Data
public class account {
    @TableId(value = "account_id",type = IdType.AUTO)
    private String accountId;
    private String accountName;
    private String password;
    private String power;
    private String phone;
    private String email;
    private String orderlistId;
}
