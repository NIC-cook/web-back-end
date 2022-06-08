package com.metajrs.controller;

import com.metajrs.common.Result;
import com.metajrs.entity.account;
import com.metajrs.entity.seller;
import com.metajrs.mapper.accountMapper;
import com.metajrs.mapper.sellerMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@RestController
@RequestMapping(value = "/seller",method = RequestMethod.GET)
public class sellerController {
    @Resource
    sellerMapper sellerMapper;

    @PostMapping("/saveMall")//商家注册
    public Result<?> saveMall(@RequestBody seller seller){
        Random r=new Random();
        seller.setShop_id("10"+(r.nextInt(99)+100));
        sellerMapper.insert(seller);
        return Result.success();
    }
}
