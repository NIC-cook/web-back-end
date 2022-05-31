package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getAccountName {
    @Select("select account_name from accountlist where account_id= #{id}")
    String getName(String id);
    @Select("select password from accountlist where account_id= #{id}")
    String getpassword(String id);
}
