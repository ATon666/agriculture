package com.sxm.agriculture.service.impl;

import com.sxm.agriculture.entity.Alldata;
import com.sxm.agriculture.mapper.*;
import com.sxm.agriculture.service.ReceiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/16 16:35
 * @description
 */

@Service
public class ReceiveDataImpl implements ReceiveDataService {

    Soil1Mapper soil1Mapper;
    Soil2Mapper soil2Mapper;
    Soil3Mapper soil3Mapper;
    Atmosphere1Mapper atmosphere1Mapper;
    Atmosphere2Mapper atmosphere2Mapper;
    Atmosphere3Mapper atmosphere3Mapper;

    @Autowired(required = false)
    public ReceiveDataImpl(Soil1Mapper soil1Mapper, Soil2Mapper soil2Mapper, Soil3Mapper soil3Mapper, Atmosphere1Mapper atmosphere1Mapper, Atmosphere2Mapper atmosphere2Mapper, Atmosphere3Mapper atmosphere3Mapper) {
        this.soil1Mapper = soil1Mapper;
        this.soil2Mapper = soil2Mapper;
        this.soil3Mapper = soil3Mapper;
        this.atmosphere1Mapper = atmosphere1Mapper;
        this.atmosphere2Mapper = atmosphere2Mapper;
        this.atmosphere3Mapper = atmosphere3Mapper;
    }

    @Override
    public void storeData(Alldata alldata) {
        int a = alldata.getLocation();
        switch (a) {
            case 1:
                soil1Mapper.insertSoilData(alldata.getSoil());
                atmosphere1Mapper.insertAtmosphereData(alldata.getAtmosphere());
                break;
            case 2:
                soil2Mapper.insertSoilData(alldata.getSoil());
                atmosphere2Mapper.insertAtmosphereData(alldata.getAtmosphere());
                break;
            case 3:
                soil3Mapper.insertSoilData(alldata.getSoil());
                atmosphere3Mapper.insertAtmosphereData(alldata.getAtmosphere());
                break;
            default:
                break;
        }
    }
}
