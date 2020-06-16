package com.sxm.agriculture.mapper;

import com.sxm.agriculture.entity.Soil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/16 17:46
 * @description 数据表 土壤站点1 的Mapper
 */


@Mapper
public interface Soil1Mapper {
    @Insert("insert into location_1_soil(location,monitor,temperature,humidity,ec,ph) values(#{location},#{monitor},#{temperature},#{humidity},#{ec},#{ph})")
    public int insertSoil(Soil soil);
}
