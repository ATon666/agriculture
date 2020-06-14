package com.sxm.agriculture.receive;

import com.sxm.agriculture.utils.JudgeDataUtil;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 15:20
 * @description 用来接收从下位机中发来的数据
 */


public class UdpReceiver {


    private DatagramSocket socket;
    private DatagramPacket packet;
    private byte[] arr;
    private int len;
    private String s;
    private SendData sendData;

    public UdpReceiver() {
        init();
    }

    private void init() {
        try {
            socket = new DatagramSocket(18080);
            packet = new DatagramPacket(new byte[128], 128);
            sendData = new SendData();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public String getDataHex() {
        try {

            socket.receive(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        arr = packet.getData();
        len = packet.getLength();
        s = new String(arr, 0, len);
        System.out.println("原始数据:" + s);
        if (JudgeDataUtil.isLegal(s)) {
            return s;
        } else {
            return null;
        }
    }
}
