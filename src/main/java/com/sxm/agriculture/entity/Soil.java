package com.sxm.agriculture.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 18:39
 * @description 土壤中的数据
 */

@Getter
@Setter
@ToString
public class Soil {
    private int id;
    private int location;
    private int monitor;
    private float temperature;
    private float humidity;
    private int ec;
    private float ph;

}
