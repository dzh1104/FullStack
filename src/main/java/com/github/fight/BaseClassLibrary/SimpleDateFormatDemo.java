package com.github.fight.BaseClassLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;

// 自定义日期格式化模式
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat();

        // 定义自己想要什么样的模式
        String pattern = "yyyy-MM-dd HH:mm:ss";
        sd.applyPattern(pattern);

        // 以指定的模式格式化哪个日期
        String res = sd.format(date);
        System.out.println(res);
    }
}
