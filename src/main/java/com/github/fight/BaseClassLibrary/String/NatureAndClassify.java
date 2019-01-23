package com.github.fight.BaseClassLibrary.String;

// 字符串的本质和分类
public class NatureAndClassify {
    public static void main(String[] args) {
        String str = "abc";
        // 等效于
        char[] chArr = new char[]{'a', 'b', 'c'};
        String str1 = new String(chArr);
        /*
        * 本质：一组字符数组
        * */

        /*
        * 分类：
        *   1.不可变字符串： String
        *   2.可变字符串： StringBuffer StringBuilder
        *
        * 说明：变 指的 是 内存地址变化
        * */

        String str2 = "hello";
        System.out.println(str2.hashCode());
        str2 = "world";
        System.out.println(str2.hashCode());
        /*
        * 前后两个字符串"hello" "world"
        * "hello"所在的内存地址内容 并不是 更改为 "world"，而是销毁"hello"，回收其所在地址，新建一个内存地址，存放的内容是"world"，并把str2指向新的内存地址
        * */
    }
}
