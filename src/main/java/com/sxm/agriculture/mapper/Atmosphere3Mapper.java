package com.sxm.agriculture.mapper;

import com.sxm.agriculture.entity.Atmosphere;
import com.sxm.agriculture.entity.Soil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/16 17:50
 * @description  数据表 大气站点3 的Mapper
 */

@Mapper
public interface Atmosphere3Mapper {

    @Insert("insert into location_3_atmosphere(location,monitor,temperature,humidity,atmospheric_pressure,co2,windvelocity,winddirection,light) " +
            "values(#{location},#{monitor},#{temperature},#{humidity},#{atmosphericPressure},#{co2},#{windVelocity},#{windDirection},#{light})")
    public int insertAtmosphereData(Atmosphere atmosphere);
}
