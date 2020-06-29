package com.sxm.agriculture.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/29 23:31
 * @description 登录用实体类
 */

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String userName;
    private String password;
}
