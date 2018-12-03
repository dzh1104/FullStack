package com.github.fight.ObjectOrientedUp.Inherit;

// 继承

/*
* 获得父类的全部成员变量和方法(非private访问权限的，仅类中访问的)
* 不能获得父类的构造器
* 单继承: 最多只有一个父类
* 重写: 两同两小一大
* super限定--用法1: 访问父类的实例方法
* super限定--用法2: 调用父类构造器(super和this出现在构造器中时，都必须位于构造器执行体的第一行，所以不会同时调用)
* java.langObject => classA => classB，通过new调用classB的构造器实例化对象，父类classA的构造器可能会调用多个
* */
class Bird {
    private int age;

    String notice = "Bird notice";

    public Bird (String name) {}

    public void fly () {

        System.out.println("Bird的fly");
    }
}

class Ostrich extends Bird {
    int age = 2;

    private String notice = "Ostrich notice";

    public Ostrich () {
        super("zh");
    }

    public Ostrich (String msg) {
        super("zhaohua");
    }
    public void fly () {

        System.out.println("Ostrich的fly");
    }
}
public class Override {

    public static void main(String[] args) {
        Ostrich obj = new Ostrich();

        // 访问权限报错
        /*
        * 下面对象有notice实例变量，但是因为权限是private，所以报错!
        * 系统不会去访问父类中的notice实例变量，必须强制向上转换类型，才能访问到!
        * */
        // System.out.println(obj.notice);
        System.out.println(((Bird)obj).notice);
        obj.fly();
    }
}
