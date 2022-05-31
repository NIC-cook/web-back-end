package com.metajrs.controller;

import com.metajrs.service.*;
import com.metajrs.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class usergetController {

    @Autowired
    private getuserID userid;

    @Autowired
    private getuserNAME username;

    @Autowired
    private getuserPassword userpassword;

    @Autowired
    private getuserDate userdate;

    @Autowired
    private getuserPrivate_key getuserprivate_key;

    @Autowired
    private com.metajrs.service.getuserImage getuserImage;

    @RequestMapping("/getUser_id")
    public String getUser_id(@RequestParam(value="id",required = false)String id){
        return userid.getUser_id(id);
    }

    @RequestMapping("/getUser_name")
    public String getUser_name(@RequestParam(value="id",required = false)String id){
        return username.getUser_name(id);
    }

    @RequestMapping("/getPassword")
    public String getPassword(@RequestParam(value="id",required = false)String id){
        return userpassword.getPassword(id);
    }

    @RequestMapping("/getDate")
    public String getDate(@RequestParam(value="id",required = false)String id){
        return userdate.getDate(id);
    }

    @RequestMapping("/getPrivate_key")
    public String getPrivate_key(@RequestParam(value="id",required = false)String id){
        return getuserprivate_key.getPrivate_key(id);
    }

    @RequestMapping("/getImage")
    public String getImage(@RequestParam(value="id",required = false)String id){
        return getuserImage.getImage(id);
    }
}
