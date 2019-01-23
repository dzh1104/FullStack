package com.github.fight.BaseClassLibrary;

// Math类
// java.math.BigDecimal java.lang.Math区别开
// 学习文章：https://www.cnblogs.com/whiteme/p/7234243.html
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        int a = 10;
        int b = 12;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        // 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
        System.out.println(Math.random());

        System.out.println((int)(Math.random() * 100) + 20);

        System.out.println(Math.ceil(-10.19));
        System.out.println(Math.floor(-10.19));
        System.out.println(Math.floor(10.73));

        /*
        rint 四舍五入，返回double值
        注意.5的时候会取偶数    异常的尴尬
         */
        System.out.println(Math.rint(10.5));
        System.out.println(Math.rint(10.51));

        /*
        round 四舍五入，float时返回int值，double时返回long值
         */
        System.out.println(Math.round(10.1));   // 10
        System.out.println(Math.round(10.7));   // 11
        System.out.println(Math.round(10.7F));  // 11 类型不一样的~
    }
}
