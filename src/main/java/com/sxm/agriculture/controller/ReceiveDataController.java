package com.sxm.agriculture.controller;

import com.sxm.agriculture.entity.Alldata;
import com.sxm.agriculture.receive.SendDataThread;
import com.sxm.agriculture.service.ReceiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 16:30
 * @description 用来接收下位机传过来的Json格式的数据
 */
@Controller
public class ReceiveDataController {


    private ReceiveDataService receiveDataService;
    private SendDataThread sendDataThread;

    @Autowired
    public ReceiveDataController(ReceiveDataService receiveDataService, SendDataThread sendDataThread) {
        this.receiveDataService = receiveDataService;
        this.sendDataThread = sendDataThread;
    }

    @ResponseBody
    @PostMapping("/receivedata")
    public String storeData(@RequestBody Alldata alldata) {
        receiveDataService.storeData(alldata);
        return "ok";
    }

    @ResponseBody
    @GetMapping("/startReceive")
    public String startReceive() {
        sendDataThread.init();
        sendDataThread.run();
        System.out.println("开始接受数据");
        return "OK";
    }


}
