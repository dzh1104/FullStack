package com.github.fight.ObjectOrientedDown.Lambda;

// Lambda表达式
/*
 * 支持将代码块作为方法参数
 * 更简洁的代码来创建只有 一个 抽象方法的接口(函数式接口)的实例
 * Lambda表达式实际上将会被当成一个"任意类型"的对象，到底需要当成何种类型的对象，这取决于运行环境的需要
 * 理解:
 *   1)代码块作为方法参数
 *   2)创建只有 一个 抽象方法的接口的实例
 *   3)一个对象
 *   4)形参列表: 取决于抽象方法的形参列表，可以省略形参类型
 *   5)->
 *   6)代码块: 就是运行时重写抽象方法的方法体
 * */
interface Eatable {

    void taste();
    // void taste2();
}

interface Flyable {

    void fly(String weather);

}

interface Addable {
    int add(int a, int b);

}

public class Introduction {

    // 调用方法需要Eatable对象
    public void eat(Eatable e) {

        System.out.println(e); e.taste();
    }

    // 调用方法需要Flyable对象
    public void drive(Flyable f) {

        System.out.println("我正在驾驶: " + f); f.fly("【碧空如洗的晴日】");
    }

    // 调用方法需要Addable对象
    public void test(Addable add) {

        System.out.println("5与3的和为: " + add.add(5, 3));
    }

    public static void main(String[] args) {

        Introduction i = new Introduction();
        // Lambda表达式的代码块只有一条语句，可以省略花括号
        i.eat(() -> System.out.println("苹果的味道不错"));
        // Lambda表达式的形参列表只有一个形参，可以省略圆括号
        // 可以省略形参类型
        // i.drive((String weather) -> {
        i.drive(weather -> {
            System.out.println("今天的天气是: " + weather); System.out.println("直升机飞行平稳");
        });
        // Lambda表达式的代码块只有一条语句，可以省略花括号
        // 代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字
        i.test((a, b) -> a + b);
    }

}
