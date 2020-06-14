package com.sxm.agriculture.receive;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 17:49
 * @description 把发送过来的16进制分割
 */


public class ParsieData {

    private final int[] len = {4, 6, 8, 12, 16, 24, 28, 36, 40, 44, 48, 52, 56, 60};
    private final int num;
    private UdpReceiver udpReceiver;
    private String dataHex;

    //datas  String 类型的数据
    String[] dataS;

    public ParsieData(String dataHex) {
        this.dataHex = dataHex;
        num = 13;
        dataS = new String[num];
    }

    /**
     * 把发过来的十六进制的数据分隔开
     *
     * @return
     */
    public String[] spliteDataHex() {
        for (int i = 0; i < num; i++) {
            dataS[i] = dataHex.substring(len[i], len[i + 1]);
        }
        return dataS;
    }

}
