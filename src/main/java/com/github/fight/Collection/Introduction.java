package com.github.fight.Collection;

// Java集合

/**
 * 集合：就是用来存放数据的 一个 容器
 *
 * 数组：也具有同样的功能，为何还有集合？数组有什么不足？
 *  1.长度固定
 *
 * 从而有了集合类
 *
 * 集合类：
 *  1.长度可变，随着元素的增加而增加
 *  2.能存储任意的对象
 *
 * 数组和集合的区别：
 *  1.数组能存基本数据类型和引用类型，集合当中只能存放引用数据类型，直接放，也会自动装箱（把基本数据类型转成对象）
 *  2.数组长度笃定，不能再去增长，集合长度是可以改变的
 *
 * 什么时候使用数组，什么时候使用集合类？
 *  1.如果元素个数是固定的，推荐使用数组
 *  2.如果元素个数不是固定的，推荐使用集合
 * */
public class Introduction {

    public static void main(String[] args) {
        int[] intArr = {10, 20, 4};
        // java.lang.ArrayIndexOutOfBoundsException: 4
        intArr[4] = 50;
    }
}
