package com.metajrs.mapper;

import com.metajrs.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

/*
@author ZhongTongYi
@Date 2022/4/7
* */

@Component
public interface getUser_id {

    @Select("select user_id from userinfo where user_id= #{id}")
    String getUser_id(String id);    //获取所有学生信息
}
