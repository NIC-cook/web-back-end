package com.metajrs.controller;

import com.metajrs.common.Result;
import com.metajrs.entity.account;
import com.metajrs.mapper.accountMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@RestController
@RequestMapping(value = "/account",method = RequestMethod.GET)
public class accountController {

    @Resource
    accountMapper accountMapper;

    @PostMapping
    public Result<?> save(@RequestBody account account){
        Random r=new Random();
        account.setPower("3");
        account.setAccount_id("10"+(r.nextDouble()*100));
        account.setOrderList_id(account.getAccount_id());
        accountMapper.insert(account);
        return Result.success();
    }
}
