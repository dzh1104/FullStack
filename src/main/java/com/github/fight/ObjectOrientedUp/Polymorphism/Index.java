package com.github.fight.ObjectOrientedUp.Polymorphism;

// 多态
/*
* 时机: 子类对象父类变量
* 相同类型的变量 调用同一个方法时呈现出多种不同的行为特征，这就是多态
* 方法有多态性，对象的实例变量不具备多态性
 * 编写程序时，引用变量只能调用它编译时类型的方法，而不能调用它运行时类型的方法，即使它实际所引用的对象确实包含该方法
 *
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
        // java.lang.classCaseException
        /*
         * 强制类型转换:
         *   1) 基本类型之间的转换只能在数值类型之间进行
         *   2) 引用类型之间的转换只能在具有继承关系的两个类型之间进行，如果两个没有任何继承关系的类型，则
         *   无法进行类型转换，否则编译时就会出现错误，但是不会有编辑器错误语法提示，运行报错。如果试图把一
         *   个父类实例转换成子类类型，则这个对象必须实际上是子类实例才行(即编译时类型为父类类型，而运行时类
         *   型是子类类型)，否则将在运行时引发classCaseException异常
         * */
        System.out.println(bc instanceof SubClass);
        // ((SubClass)bc).sub();

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
