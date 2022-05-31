package com.metajrs.service;

import com.metajrs.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserNAME implements getUser_name {
    @Qualifier("getUser_name")
    @Autowired
    private getUser_name user_name;

    @Override
    public String getUser_name(String id) {
        return user_name.getUser_name(id);
    }

}
