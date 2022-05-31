package com.metajrs.service;

import com.metajrs.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserID implements getUser_id {
    @Qualifier("getUser_id")
    @Autowired
    private getUser_id user_id;

    @Override
    public String getUser_id(String id) {
        return user_id.getUser_id(id);
    }

}
