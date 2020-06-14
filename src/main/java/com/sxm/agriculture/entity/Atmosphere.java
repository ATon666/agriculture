package com.sxm.agriculture.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 18:55
 * @description  大气中的数据
 */

@Getter
@Setter
@ToString
public class Atmosphere {
    private int id;
    private int location;
    private int monitor;
    private float humidity;
    private float temperature;
    private float atmosphericPressure;
    private int co2;
    private float windVelocity;
    private int windDirection;
    private int light;

}
