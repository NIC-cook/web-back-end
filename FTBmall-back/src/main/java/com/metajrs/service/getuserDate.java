package com.metajrs.service;

import com.metajrs.mapper.getDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserDate implements getDate {
    @Qualifier("getDate")
    @Autowired
    private getDate user_date;
    @Override
    public String getDate(String id) {
        return user_date.getDate(id);
    }
}
