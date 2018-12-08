package com.github.fight.ObjectOrientedDown;

// 匿名内部类

/*
 * 只需要使用一次
 * 创建匿名内部类时会立即创建一个该类的实例，这个类定义立即消失，匿名内部类不能重复使用
 * 必须继承一个父类或实现一个接口，但最多只能继承一个父类或实现一个接口
 * 两条规则:
 *   1)匿名内部类不能是抽象类。由于系统在创建匿名内部类时，会立即创建匿名内部类的对象。
 *   2)匿名内部类不能定义构造器。由于匿名内部类没有类名，所以无法定义构造器，但匿名内部类可以定义初始化块，可以使用实例初始化块来完成构造器需要完成的事情
 *
 * 当通过实现接口来创建匿名内部类时，匿名内部类也不能显式创建构造器，因此匿名内部类只有一个隐式的无参数构造器，故new接口名后的括号里不能传入参数值
 * 当通过继承父类来创建匿名内部类时，匿名内部类将拥有和父类相似的构造器，此处的相似指的是拥有相同的形参列表
 * */

interface Product {

    double getPrice();

    public String getName();

}

public class AnonymousInnerClass {

    public void test(Product p) {

        System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
    }

    public static void main(String[] args) {

        AnonymousInnerClass ai = new AnonymousInnerClass(); ai.test(new Product() {

            @Override
            public double getPrice() {

                return 18.6;
            }

            @Override
            public String getName() {

                return "入门到跑路";
            }
        });
    }

}
