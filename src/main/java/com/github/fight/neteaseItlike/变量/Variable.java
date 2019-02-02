package com.github.fight.neteaseItlike.变量;

// 变量
public class Variable {
    public static void main(String[] args) {
        // 变量：其值可以改变的量，定义好之后，可以指代某一事物

        // 格式：数据类型 变量名 = 变量值; (变量名就是自己起的名字，标识符)
        int a = 10;
        int b = 5;
        // 需求：求两个数的加、减、乘、除
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("====");
        // 不是重新定义一个变量，而是改变变量的值，指代另一个事物
        a = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        int c = 50;
        // 1.不能定义两个相同名称的变量
        // int a = 8;

        // 2.没有初始化的变量，是不能直接使用的
        int d; // 定义一个变量，只不过没有让它只指向一个事物。没有初始化

        d = 30;
        System.out.println(d);



    }
}
