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

    @PostMapping("/saveUser")//用户注册
    public Result<?> saveUser(@RequestBody account account){
        Random r=new Random();
        account.setPower("3");
        account.setAccount_id("10"+(r.nextInt(99)+100));
        account.setOrderlist_id(account.getAccount_id());
        accountMapper.insert(account);
        return Result.success();
    }

    @PostMapping("/userLogin")//用户注册
    @CrossOrigin
    public Result<?> userLogin(@RequestBody account account){
        account user;
        user=accountMapper.selectById(account.getAccount_id());
        if (user==null)
            return Result.error("400","账号不存在");
        if ( user.getPassword().equals(account.getPassword()))
            return Result.success();
        else {
                return Result.error("400", "密码错误");

        }
    }


}
