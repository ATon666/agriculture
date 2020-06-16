package com.sxm.agriculture.controller;

import com.sxm.agriculture.entity.Alldata;
import com.sxm.agriculture.service.ReceiveDataService;
import com.sxm.agriculture.service.impl.ReceiveDataImpl;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 16:30
 * @description 用来接收下位机传过来的Json格式的数据
 */
@Controller
public class ReceiveDataController {


    private ReceiveDataService receiveDataService;

    @Autowired
    public ReceiveDataController(ReceiveDataService receiveDataService) {
        this.receiveDataService = receiveDataService;
    }




    @ResponseBody
    @PostMapping("/receivedata")
    public String getData(@RequestBody Alldata alldata) {
        receiveDataService.receiveData(alldata);
        return "ok";
    }
}
