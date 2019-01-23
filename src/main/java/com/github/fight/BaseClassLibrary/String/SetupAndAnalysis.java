package com.github.fight.BaseClassLibrary.String;

// 字符串的创建和常量池内存分析
public class SetupAndAnalysis {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = new String("abc");

        /*
        * "abc"字符串常量存放在方法区中
        * new String("abc")中的字符串常量
        *   先去方法区中查看是否已存在该常量，如果有则不新建一个字符串对象，若没有，则新建一个字符串对象
        *   然后，通过String构造器会创建一个字符串对象存放在 栈内存 中，其指向常量池中的内存
        *
        * 因为通过构造器创建字符串对象，可能会创建两个对象，性能不好，因此开发中都是通过字面量的形式创建字符串
        * */
    }
}
