package com.metajrs.service;

import com.metajrs.mapper.getPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserPassword implements getPassword {
    @Qualifier("getPassword")
    @Autowired
    private getPassword user_password;

    @Override
    public String getPassword(String id) {
        return user_password.getPassword(id);
    }
}
