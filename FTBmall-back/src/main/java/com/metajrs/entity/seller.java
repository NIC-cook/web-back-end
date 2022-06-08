package com.metajrs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("seller")
@Data
public class seller {
    @TableId(value = "account_id",type = IdType.AUTO)
    private String account_id;
    private String shop_id;
    private String shop_name;
    private String address;
    private String license_id;
    private String account_name;
}
