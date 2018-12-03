package com.github.fight.ObjectOrientedUp.Polymorphism;

public class Instanceof {

    public static void main(String[] args) {

        // 声明hello时使用Object类，则hello编译类型是Object
        // Object是所有类的父类，但hello变量的运行类型(实际类型)是String
        Object hello = "hello";

        System.out.println("字符串是否是Object类的实例" + (hello instanceof Object));

        // Object是String的父类，存在继承关系，可以使用instanceof运算，返回true
        System.out.println("字符串是否是String类的实例" + (hello instanceof String));

        // Object是Math的父类，存在继承关系，可以使用instanceof运算，返回false
        System.out.println("字符串是否是Math类的实例" + (hello instanceof Math));

        // String实现了Comparable接口，所以返回true
        System.out.println("字符串是否是Comparable接口类的实例" + (hello instanceof Comparable));

        String a = "Hello";

        // String类 既不是 Math类型，也不是Math类型的父类，不存在继承关系，所以报错
        // System.out.println("字符串是否是Math类的实例" + (a instanceof Math));

        Object b = 6;

        // String类是Object类的子类，存在继承关系，可以使用instanceof 运算，返回false
        System.out.println("数字是否是String类型的实例" + (b instanceof String));
    }

}
