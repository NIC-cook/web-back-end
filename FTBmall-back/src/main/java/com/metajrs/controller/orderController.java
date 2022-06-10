package com.metajrs.controller;

import com.metajrs.common.Result;
import com.metajrs.entity.account;
import com.metajrs.entity.order;
import com.metajrs.mapper.orderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@RestController
@RequestMapping(value = "/seller",method = RequestMethod.GET)
public class orderController {
    @Resource
    orderMapper orderMapper;

    @PostMapping("/saveseller")//商家注册
    @CrossOrigin
    public Result<?> saveUser(@RequestBody order order){
        Random r=new Random();
//        order.setPower("3");
//        order.setAccountId("10"+(r.nextInt(99)+100));
//        order.setAccountId(account.getAccountId());
        orderMapper.insert(order);
        return Result.success();
    }
}
