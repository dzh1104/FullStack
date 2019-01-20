package com.github.fight.BaseClassLibrary;

import com.github.fight.BaseClassLibrary.String.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 日期工具类
public class DateUtils {
    // 工具类一般把构造器私有化，防止创建工具类对象，应该是直接使用工具类提供的方法
    private DateUtils() {
    }

    private static final String DERAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    // 1.把一个日期类型转成字符串
    public static String dateToString(Date date, String pattern) {
        // 判断传入的模式是否为空，为空的话，设置一个默认的模式
        // 使用 StringUtils工具类
        if (StringUtils.isBlank(pattern)) {
            pattern = DERAULT_PATTERN;
        }
        SimpleDateFormat sd = new SimpleDateFormat();
        sd.applyPattern(pattern);
        String res = sd.format(date);
        return res;
    }

    // 方法的重载
    public static String dateToString(Date date) {
        String res = DateUtils.dateToString(date, "");
        return res;
    }

    // 2.把一个字符串转成日期类型
    public static Date stringToDate(String str, String pattern) throws ParseException {
        if (StringUtils.isBlank(pattern)) {
            pattern = DERAULT_PATTERN;
        }
        SimpleDateFormat sd = new SimpleDateFormat();
        sd.applyPattern(pattern);
        Date res = sd.parse(str);
        return res;
    }

}
