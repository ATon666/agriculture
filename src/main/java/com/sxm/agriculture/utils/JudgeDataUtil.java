package com.sxm.agriculture.utils;

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
}
