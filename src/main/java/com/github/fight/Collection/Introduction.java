package com.github.fight.Collection;

// Java集合

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合：就是用来存放数据的 一个 容器
 * <p>
 * 数组：也具有同样的功能，为何还有集合？数组有什么不足？
 * 1.长度固定
 * <p>
 * 从而有了集合类
 * <p>
 * 集合类：
 * 1.长度可变，随着元素的增加而增加
 * 2.能存储任意的对象
 * <p>
 * 数组和集合的区别：
 * 1.数组能存基本数据类型和引用类型，集合当中只能存放引用数据类型，直接放，也会自动装箱（把基本数据类型转成对象）
 * 2.数组长度固定，不能再去增长，集合长度是可以改变的
 * <p>
 * 什么时候使用数组，什么时候使用集合类？
 * 1.如果元素个数是固定的，推荐使用数组
 * 2.如果元素个数不是固定的，推荐使用集合
 */
public class Introduction {

    public static void main(String[] args) {
        int[] intArr = {10, 20, 4};
        // java.lang.ArrayIndexOutOfBoundsException: 4
        // intArr[4] = 50;

        // 多态 / 面向接口编程 的写法，运行时，表现出来的是子类的特征
        Collection c = new ArrayList();
        boolean b1 = c.add("abc");
        // 自动装箱
        boolean b2 = c.add(10);
        boolean b3 = c.add(true);

        boolean b4 = c.add(new Student("zhangsan", 18));

        boolean b5 = c.add("abc");

        // 结果都是true，可以添加重复元素，在今后开发当中，不会接受结果，Set当中不能添加重复元素，如果添加就给一个false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        // ArrayList已经覆盖了toString()，直接可以打印结果
        System.out.println(c);

        System.out.println("========");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        System.out.println(c2);

        // 移除集合中指定的元素
        c2.remove("a");

        System.out.println(c2);

        // 获取集合的长度
        System.out.println(c2.size());

        // 清空集合中所有的元素
        c2.clear();
        System.out.println(c2);

        // 判断一个集合是否为空
        System.out.println(c2.isEmpty());

        System.out.println(c2.size());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}