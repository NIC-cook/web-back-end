package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getPassword {
    @Select("select password from userinfo where user_id= #{id}")
    String getPassword(String id);
}
