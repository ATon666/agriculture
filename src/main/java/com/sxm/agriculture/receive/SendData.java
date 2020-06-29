package com.sxm.agriculture.receive;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 17:37
 * @description 把接受的上位机程序解析后用http发送给服务器
 */


public class SendData {

    private MediaType mediaType;
    private final String urlHead;
    String body;
    private DataHexToJson dataHexToJson;
    private String url;
    private final OkHttpClient okHttpClient;
    private ParsieData parsieData;

    public SendData() {
        mediaType = MediaType.parse("application/json; charset=utf-8");
        urlHead = "http://localhost:18080/receivedata";
        okHttpClient = new OkHttpClient();
    }

    /**
     *
     * @param s  最原始的十六进制字符串数据
     */
    public void send(String s) {
        url = urlHead;
        parsieData = new ParsieData(s);
        dataHexToJson = new DataHexToJson(parsieData.spliteDataHex());
        body = dataHexToJson.getJson();
        RequestBody requestBody = RequestBody.Companion.create(body, mediaType);

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
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
