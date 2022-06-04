package com.metajrs.controller;

import com.metajrs.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("getaccount")
public class accountgetController {

    @Autowired
    private getAccount_Name name;


    @RequestMapping("/getAccount_id")
    public String getAccount_id(@RequestParam(value="id",required = false)String id,@RequestParam(value = "password",required = false)String password){
        return name.getName(id);
    }
    @RequestMapping("/getPassword")
    public String getPassword(@RequestParam(value="id",required = false)String id){
        return name.getPassword(id);
    }

}
