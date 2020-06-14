package com.sxm.agriculture.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 0:04
 * @description 把大气和土壤中的数据结合在一起
 */

@Getter
@Setter
@ToString
public class Alldata {
    int location;
    int monitor;
    private Atmosphere atmosphere;
    private Soil soil;
}
