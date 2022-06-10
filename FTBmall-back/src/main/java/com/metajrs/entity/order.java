package com.metajrs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("oerder")
@Data
public class order {
    @TableId(value = "orderListId",type = IdType.AUTO)
    private String orderlistId;
    private String buyer_id;
    private String shop_id;
    private String goods_id;
    private String goodscount;
    private String money;
    private String warehouseaddress;
    private String buyeraddress;
    private String expressnumber;
    private String state;
}
