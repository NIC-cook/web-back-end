package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getUser_name {

    @Select("select user_name from userinfo where user_id= #{id}")
    String getUser_name(String id);
}
