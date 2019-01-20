package com.github.fight.BaseClassLibrary;

import java.util.Date;

// 使用日期工具类
public class UseDateUtilsDemo {
    public static void main(String[] args) {
        // 把一个日期类型转成字符串
        String res = DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(res);

        String res1 = DateUtils.dateToString(new Date(), "");
        System.out.println(res1);

        String res2 = DateUtils.dateToString(new Date(), null);
        System.out.println(res2);

        String res3 = DateUtils.dateToString(new Date());
        System.out.println(res3);

    }
}
