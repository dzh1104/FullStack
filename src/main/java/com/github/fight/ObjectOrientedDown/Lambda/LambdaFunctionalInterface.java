package com.github.fight.ObjectOrientedDown.Lambda;

// 表达式的目标类型

/*
 * 必须是函数式接口(只包含一个抽象方法的接口，可以包含多个默认方法、类方法)
 * Lambda表达式实现的是匿名方法，因此它只能实现特定函数式接口中的唯一方法
 * 限制:
 *   1)Lambda表达式的目标类型必须是明确的函数式接口
 *   2)Lambda表达式只能为函数式接口创建对象。Lambda表达式只能实现一个方法，因此它只能为只有一个抽象方法的接口(函数式接口)创建对象
 * */

@FunctionalInterface
interface FkTest {

    void run();

}

public class LambdaFunctionalInterface {

    public static void main(String[] args) {
        // Lambda表达式进行赋值
        /*
         * Runnable接口是函数式接口，只包含一个无参数的方法(抽象方法)
         * Lambda表达式代表的匿名方法实现了Runnable接口中唯一的、无参数的方法
         * 因此下面的Lambda表达式创建了一个Runnable对象
         * */
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };

        // Lambda表达式的目标类型是一个明确的函数式接口
        /*
        Object o = () -> {
            for(int i = 0; i < 100; i ++) {
                System.out.println(i);
            }
        };
        */

        // 三种常见方法
        /*
         * 1)将Lambda表达式赋值给函数式接口类型的变量
         * 2)将Lambda表达式作为函数式接口类型的参数传给方法
         * 3)使用函数式接口对Lambda表达式进行强制类型转换
         * */
        // 强制类型转换，可以明确该表达式的目标类型是Runnable函数式接口
        Object o = (Runnable) () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };

        // 说明: 同样的Lambda表达式的目标类型完全可能是变化的——唯一的要求是: Lambda表达式实现的匿名方法与目标类型(函数式接口)中唯一的抽象方法有相同的形参列表

        // 同样的Lambda表达式可以被当成不同的目标类型
        Object obj = (FkTest) () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
    }

}
