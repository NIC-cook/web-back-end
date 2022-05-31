package com.metajrs.service;

import com.metajrs.mapper.getAccountName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getAccount_Name {
    @Qualifier("getAccountName")
    @Autowired
    private getAccountName Account;

    public String getName(String id) {
        return Account.getName(id);
    }
    public String getPassword(String id) {
        return Account.getpassword(id);
    }
}
