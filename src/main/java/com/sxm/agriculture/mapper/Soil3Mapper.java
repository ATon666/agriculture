package com.sxm.agriculture.mapper;

import com.sxm.agriculture.entity.Soil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/16 17:46
 * @description 数据表 土壤站点3 的Mapper
 */

@Mapper
public interface Soil3Mapper {

    @Insert("insert into location_3_soil(location,monitor,temperature,humidity,ec,ph) values(#{location},#{monitor},#{temperature},#{humidity},#{ec},#{ph})")
    public int insertSoilData(Soil soil);

}
