package com.sxm.agriculture;

import com.sxm.agriculture.receive.SendData;
import com.sxm.agriculture.receive.SendDataThread;
import com.sxm.agriculture.receive.UdpReceiver;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;

@MapperScan(value = "com.sxm.agriculture.mapper")
@SpringBootApplication
@EnableAsync
public class AgricultureApplication {

    public static void main(String[] args) {
        String url = "http://localhost:18080/startReceive";
        SpringApplication.run(AgricultureApplication.class, args);
//        new Thread(new SendDataThread()).start();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }
        });
    }

}
