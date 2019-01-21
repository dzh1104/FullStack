package com.github.fight.BaseClassLibrary.Calendar;

import java.util.Calendar;

// 使用 DateFormat 类来格式化和解析日期字符串
// 使用 Calendar 类实现日期和时间字段之间转换

/**
 * 为了更加便捷的对日期进行操作，Calendar类对YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法，
 * 并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 瞬间可用毫秒值来表示，它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高利历）的偏移量。
 */

// Calendar类中也有before，after，compareTo等方法，用法与Date类的类似，只是现在推荐用Calendar类操作日期
public class Introduction {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        Calendar calendar = Calendar.getInstance();

        // 基本用法，获取年月日时分秒星期

        // 获取年
        // int year = calendar.get(1);
        int year = calendar.get(Calendar.YEAR);

        // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int month = calendar.get(Calendar.MONTH) + 1;

        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // 获取时
        int hour = calendar.get(Calendar.HOUR);

        // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
        // 获取分
        int minute = calendar.get(Calendar.MINUTE);

        // 获取秒
        int second = calendar.get(Calendar.SECOND);

        // 星期，英语国家星期从星期日开始计算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("现在是" + year + "年" + month + "月" + day + "日" + hour
                + "时" + minute + "分" + second + "秒" + "星期" + weekday);

        // 一年后的今天

        // 同理换成下个月的今天calendar.add(Calendar.MONTH, 1);
        // calendar.add(Calendar.YEAR, 1);
        // // calendar.add(Calendar.MONTH, 1);
        //
        // // 获取年
        // int year1 = calendar.get(Calendar.YEAR);
        //
        // // 获取月
        // int month1 = calendar.get(Calendar.MONTH) + 1;
        //
        // // 获取日
        // int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        //
        // System.out.println("一年后的今天：" + year1 + "年" + month1 + "月" + day1 + "日");

        // 获取任意一个月的最后一天

        // 假设求6月的最后一天
        int currentMonth = 6;
        // 先求出7月份的第一天，实际中这里6为外部传递进来的currentMonth变量
        // 1
        calendar.set(calendar.get(Calendar.YEAR), currentMonth, 1);

        calendar.add(Calendar.DATE, -1);

        // 获取日
        int day2 = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("6月份的最后一天为" + day2 + "号");

        // 设置日期

        calendar.set(Calendar.YEAR, 2000);
        System.out.println("现在是" + calendar.get(Calendar.YEAR) + "年");

        calendar.set(2008, 8, 8);
        // 获取年
        int year3 = calendar.get(Calendar.YEAR);

        // 获取月
        int month3 = calendar.get(Calendar.MONTH);

        // 获取日
        int day3 = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("现在是" + year3 + "年" + month3 + "月" + day3 + "日");
    }
}
