package com.github.fight.ObjectOrientedDown.Lambda;

// 构造器引用
// Lambda表达式只有一条代码时，还可以使用方法引用和构造器引用，使得代码更加简洁

import javax.swing.*;

@FunctionalInterface
interface YourTest {

    JFrame win(String title);

}

public class ConstructorReference {

    public static void main(String[] args) {
        // 使用Lambda表达式创建YourTest对象
        YourTest yt1 = title -> new JFrame(title); JFrame jf1 = yt1.win("我的窗口"); System.out.println(jf1);

        // 构造器引用代替Lambda表达式
        // 函数式接口中被实现方法的全部参数传给该构造器作为参数
        YourTest yt2 = JFrame::new; JFrame jf2 = yt2.win("我的窗口"); System.out.println(jf2);
    }

}
