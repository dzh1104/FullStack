package com.github.fight.BaseClassLibrary;

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

        // 把一个毫秒值 转成日期类型
        // 获取当前时间的 毫秒
        long curTime = System.currentTimeMillis();
    }
}
