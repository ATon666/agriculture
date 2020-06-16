package com.sxm.agriculture;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.*;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 17:52
 * @description
 */


public class mytest {


    @Test
    public void test1() {
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void test2() {

        String s = "FFAA010101010101010101010101010101010101010101010101010101010000EEBB";
        if (s.startsWith("FFAA") && s.endsWith("0000EEBB") && s.length() == 68) {
            System.out.println(true);
        }
        String substring = s.substring(60, 64);
        System.out.println(substring);

    }

    @Test
    public void test3() {
        String s = "ffFF";
        int integer = Integer.valueOf(s, 16);
        System.out.println(integer);
//        integer = Integer.valueOf(s, 16)/10;
        float i = (float) integer / 10;
        System.out.println(i);

    }

    @Test
    public void teste() throws IOException {
        String str = "FFAA01010101010101010101010101010101010101010101010101010101EEBB";

        DatagramSocket socket = new DatagramSocket();

        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("47.102.218.114"), 18080);

        socket.send(packet);
        socket.close();


    }

}
