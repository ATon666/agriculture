package com.sxm.agriculture.mapper;

import com.sxm.agriculture.entity.Atmosphere;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/16 17:50
 * @description  数据表 大气站点1 的Mapper
 */

@Mapper
public interface Atmosphere1Mapper {

    @Insert("insert into location_1_atmosphere(location,monitor,temperature,humidity,atmospheric_pressure,co2,windvelocity,winddirection,light) " +
            "values(#{location},#{monitor},#{temperature},#{humidity},#{atmosphericPressure},#{co2},#{windVelocity},#{windDirection},#{light})")
    public int insertAtmosphereData(Atmosphere atmosphere);

}
