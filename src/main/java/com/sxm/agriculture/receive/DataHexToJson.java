package com.sxm.agriculture.receive;

import com.google.gson.Gson;
import com.sxm.agriculture.entity.Alldata;
import com.sxm.agriculture.entity.Atmosphere;
import com.sxm.agriculture.entity.Soil;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 1:41
 * @description 把分割之后的十六进制String类型的数据转为十进制 再转Json
 */


public class DataHexToJson {

    private Gson gson = new Gson();
    private String[] dateStr;

    public DataHexToJson(String[] dateHexStr) {
        this.dateStr = dateHexStr;
    }

    /**
     * 把数据转换成响应的类型带入进去
     *
     * @return allData
     */
    private Alldata creatObj() {
        Alldata alldata = new Alldata();
        Atmosphere atmosphere = new Atmosphere();
        Soil soil = new Soil();

        int location = Integer.valueOf(dateStr[0], 16);
        int monitor = Integer.valueOf(dateStr[1], 16);

        atmosphere.setLocation(location);
        atmosphere.setMonitor(monitor);
        atmosphere.setHumidity((float) Integer.valueOf(dateStr[2], 16) / 10);
        atmosphere.setTemperature((float) Integer.valueOf(dateStr[3], 16) / 10);
        atmosphere.setLight(Integer.valueOf(dateStr[4], 16));
        atmosphere.setCo2(Integer.valueOf(dateStr[5], 16));
        atmosphere.setAtmosphericPressure((float) Integer.valueOf(dateStr[6], 16) / 10);
        atmosphere.setWindVelocity((float) Integer.valueOf(dateStr[7], 16) / 10);
        atmosphere.setWindDirection(Integer.valueOf(dateStr[8], 16));
      /*  float atmoHumi = (float) Integer.valueOf(dateStr[2], 16) / 10;
        float atmoTemp = (float) Integer.valueOf(dateStr[3], 16) / 10;
        int light = Integer.valueOf(dateStr[4], 16);
        int co2 = Integer.valueOf(dateStr[5], 16);
        float atmosphericPressure = (float) Integer.valueOf(dateStr[6], 16) / 10;
        float windVelocity = (float) Integer.valueOf(dateStr[7], 16) / 10;
        int windDirection = Integer.valueOf(dateStr[8], 16);

        float soilHumi = (float) Integer.valueOf(dateStr[9], 16) / 10;
        float soilTemp = (float) Integer.valueOf(dateStr[10], 16) / 10;
        float ph = (float) Integer.valueOf(dateStr[11], 16) / 10;
        int ec = Integer.valueOf(dateStr[12], 16);*/

        soil.setLocation(location);
        soil.setMonitor(monitor);
        soil.setHumidity((float) Integer.valueOf(dateStr[9], 16) / 10);
        soil.setTemperature((float) Integer.valueOf(dateStr[10], 16) / 10);
        soil.setPh((float) Integer.valueOf(dateStr[11], 16) / 10);
        soil.setEc(Integer.valueOf(dateStr[12], 16));

        alldata.setLocation(location);
        alldata.setMonitor(monitor);
        alldata.setAtmosphere(atmosphere);
        alldata.setSoil(soil);
        return alldata;
    }

    public String getJson() {
        return gson.toJson(creatObj());
    }

}
