package com.metajrs.controller;

import com.metajrs.common.Result;
import com.metajrs.entity.account;
import com.metajrs.mapper.accountMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping(value = "/account",method = RequestMethod.GET)
public class accountController {

    @Resource
    accountMapper accountMapper;

    @PostMapping("/saveUser")//用户注册
    @CrossOrigin
    public Result<?> saveUser(@RequestBody account account){
        Random r=new Random();
        account.setPower("3");
        account.setAccountId("10"+(r.nextInt(99)+100));
        account.setAccountId(account.getAccountId());
        accountMapper.insert(account);
        return Result.success();
    }

    @PostMapping("/userLogin")//用户登陆
    @CrossOrigin
    public Result<?> userLogin(@RequestBody account account){
        account user;
        user=accountMapper.selectById(account.getAccountId());
        System.out.println(user);
        if (user==null)//账号错误
            return Result.error("401","账号不存在");
        if ( user.getPassword().equals(account.getPassword()))//成功
            return Result.success(user.getPower());
        else {//密码错误
                return Result.error("402", "密码错误");
        }
    }

    @GetMapping("/getAccount")//用户登陆
    @CrossOrigin
    public Result<?> getaccount(@RequestParam("search") String account){
        account user;
        List<account> userList;
        if (account.equals("all"))
        {
            userList=accountMapper.selectList(null);
            System.out.println(userList);
            return Result.success(userList);
        }
        else{
            user=accountMapper.selectById(account);
            return Result.success(user);
        }

    }
}
