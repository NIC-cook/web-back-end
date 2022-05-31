package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getPrivate_key {
    @Select("select private_key from userinfo where user_id= #{id}")
    String getPrivate_key(String id);
}
