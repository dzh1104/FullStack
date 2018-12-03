package com.github.fight.ObjectOrientedUp.Polymorphism;

// 多态
/*
* 时机: 子类对象父类变量
* 相同类型的变量 调用同一个方法时呈现出多种不同的行为特征，这就是多态
* 方法有多态性，对象的实例变量不具备多态性
* */

class BaseClass {
    public int book = 6;

    public void base () {

        System.out.println("父类的普通方法");
    }

    public void test () {

        System.out.println("父类的被覆盖的方法");
    }
}

class SubClass extends BaseClass {
    public String book = "JAVA";

    public void test () {

        System.out.println("子类的覆盖父类的方法");
    }

    public void sub () {

        System.out.println("子类的普通方法");
    }
}
public class Index {
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        sc.sub();

        BaseClass bs = new SubClass();
        // 实例变量无多态
        System.out.println(bs.book);
        // 子类的方法被调用 最上面的调用的是父类的方法，出现多态
        bs.base();
        bs.test();
        // 编译不通过，因为父类中无此方法
        // bs.sub();
        // 强制类型转换，可调用子类中的方法
        ((SubClass)bs).sub();
    }
}
