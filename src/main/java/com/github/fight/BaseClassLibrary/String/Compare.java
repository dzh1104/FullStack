package com.github.fight.BaseClassLibrary.String;

// 字符串的两种比较方式
public class Compare {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = new String("abc");

        System.out.println(str == str1); // 内存地址的比较
        System.out.println(str.equals(str1)); // String已重写equals方法，比较字符序列
    }
}
