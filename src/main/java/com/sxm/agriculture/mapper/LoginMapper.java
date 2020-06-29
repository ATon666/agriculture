package com.sxm.agriculture.mapper;

import com.sxm.agriculture.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/29 23:47
 * @description 用于登录
 */

@Mapper
public interface LoginMapper {

    @Select("select * from login where username=#{username}")
    public User getUserByName(String userName);

}
