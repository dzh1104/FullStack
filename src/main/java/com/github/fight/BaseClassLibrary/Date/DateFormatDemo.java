package com.github.fight.BaseClassLibrary.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

// 日期格式化
// 使用 DateFormat 类来格式化和解析日期字符串
// 使用 Calendar 类实现日期和时间字段之间转换
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        // 获得一个默认的日期/时间格式器,使用短样式的日期和时间
        DateFormat df = DateFormat.getInstance();

        // 对指定的日期进行格式化
        String time = df.format(date);
        System.out.println(time);

        // 短样式
        DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        String time1 = df1.format(date);
        System.out.println(time1);

        // 长样式
        DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String time2 = df2.format(date);
        System.out.println(time2);

        // 获取时间
        DateFormat df3 = DateFormat.getTimeInstance();
        String time3 = df3.format(date);
        System.out.println(time3);

        // 把一个字符串 转成 日期
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String newStr = "2019年1月20日 上午10时19分09秒";
        Date date2 = df4.parse(newStr);
        System.out.println(date2);
    }
}
