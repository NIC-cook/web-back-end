package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getDate {
    @Select("select date from userinfo where user_id= #{id}")
    String getDate(String id);
}
