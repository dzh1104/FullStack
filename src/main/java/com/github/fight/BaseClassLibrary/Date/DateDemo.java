package com.github.fight.BaseClassLibrary.Date;

import java.util.Date;

// 使用int String类型表示日期不好
// 要使用java当中专门提供的日期类型
class Employee {
    int age;
    String hireDate;
}

public class DateDemo {

    public static void main(String[] args) {
        // 创建一个日期对象
        Date date = new Date();
        System.out.println(date);

        // 获取当前时间的 毫秒: 时间戳
        long curTime = System.currentTimeMillis();
        System.out.println(curTime);
        // 把一个毫秒值 转成日期类型
        Date date1 = new Date(curTime);
        System.out.println(date1);

        // 中国人喜欢的风格
        String str = date1.toLocaleString();
        System.out.println(str);

        // 把一个日期类型转成时间戳
        System.out.println(date1.getTime());
    }
}
