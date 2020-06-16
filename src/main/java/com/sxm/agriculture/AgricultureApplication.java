package com.sxm.agriculture;

import com.sxm.agriculture.receive.SendData;
import com.sxm.agriculture.receive.SendDataThread;
import com.sxm.agriculture.receive.UdpReceiver;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.sxm.agriculture.mapper")
@SpringBootApplication
public class AgricultureApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgricultureApplication.class, args);
        new Thread(new SendDataThread()).start();
    }

}
