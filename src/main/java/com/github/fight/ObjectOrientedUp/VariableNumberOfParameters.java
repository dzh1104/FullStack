package com.github.fight.ObjectOrientedUp;

// 形参个数可变的方法
public class VariableNumberOfParameters {
    // 形参个数可变的参数 本质上就是 一个数组参数

    // 长度可变的形参只能位于形参列表的最后
    // 一个方法最多只有一个长度可变的形参
    public static void test (int a, String... books) {
        // books被当成数组处理
        for (String tmp : books) {
            System.out.println(tmp);
        }
        // 输出整数变量 形参a的值
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(5, "JAVA", "fight");
    }
}
