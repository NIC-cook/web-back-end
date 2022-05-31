package com.metajrs.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface getImage {
    @Select("select image from userinfo where user_id= #{id}")
    String getImage(String id);
}
