package com.github.fight.BaseClassLibrary.String;

// 字符串的拼接和性能观察
// 可变字符串和不可变字符串的使用场景

/*
* StringBuffer : 相关方法多一个synchronized修饰，加锁，更安全
* StringBuilder : 相关方法没有synchronized修饰，没加锁，效率高一点
*
* 性能：String < StringBuffer < StringBuilder
* */
public class SplitJoint {
    public static void main(String[] args) {
        testString();
        testStringBuilder();
        testStringBuffer();
    }
    static void testString() {
        long start = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();

        long res = end - start;
        System.out.println(res);
    }
    static void testStringBuilder() {
        long start = System.currentTimeMillis();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();

        long res = end - start;
        System.out.println(res);
    }
    static void testStringBuffer() {
        long start = System.currentTimeMillis();

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();

        long res = end - start;
        System.out.println(res);
    }
}
