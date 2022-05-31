package com.metajrs.service;

import com.metajrs.mapper.getPrivate_key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserPrivate_key implements getPrivate_key {
    @Qualifier("getPrivate_key")
    @Autowired
    private getPrivate_key user_private_key;
    @Override
    public String getPrivate_key(String id) {
        return user_private_key.getPrivate_key(id);
    }
}
