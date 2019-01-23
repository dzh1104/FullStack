package com.github.fight.BaseClassLibrary.String;

// 开发中，StringBuilder使用频率高

/*
* 一个类的使用，无非是 创建 + 方法的使用
* */
public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
        * 创建的可变字符串，默认容量是16
        * 如果超过，它会自动扩容：当前容量(str.capacity()) * 2 + 2
        * 本质：是一个char[]
        * */
        StringBuilder str = new StringBuilder("init");
        System.out.println(str.capacity());
        StringBuilder str1 = new StringBuilder(16);

        // 字符串的拼接
        str.append("jljkl");
        str.append(123456).append(789); // 链式编程
        System.out.println(str);

        // 删除字符
        str.deleteCharAt(1);
        System.out.println(str);

        // 可变字符串转成不可变
        String s = str.toString();

        // 字符串的反转
        System.out.println(str.reverse());

    }
}
