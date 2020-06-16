package com.sxm.agriculture.service.impl;

import com.sxm.agriculture.entity.Alldata;
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
    @Override
    public void receiveData(Alldata alldata) {
        int monitor = alldata.getMonitor();
        System.out.println(monitor);
    }
}
