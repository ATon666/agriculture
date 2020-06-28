package com.sxm.agriculture.utils;

import org.jetbrains.annotations.NotNull;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/13 19:09
 * @description 判断数据时候合法的工具类
 */


public class JudgeDataUtil {


    /**
     * 判断数据是否以 FFAA 开始 和 EEBB 结束
     *
     * @param s 数据
     * @return 合法 true  不合法 false
     */
    public static Boolean isLegal(String s) {
        return s.startsWith("FFAA") && s.endsWith("EEBB") && s.length() == 64;
    }

    /**
     * 判断温度的正负  第一个是F则为负
     *
     * @param s 分割之后的十六进制字符串
     * @return float 类型的负数温度
     */
    public static float getTemperature(@NotNull String s) {
        if (s.startsWith("F") | s.startsWith("f")) {
            return (float) ( Integer.valueOf(s, 16)- 0xFFFF) / 10;

        } else {
            return (float) Integer.valueOf(s, 16) / 10;
        }
    }

    public static String bytesToHexString(byte[] bytes,int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
