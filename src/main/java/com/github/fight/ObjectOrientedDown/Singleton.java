package com.github.fight.ObjectOrientedDown;

// 单例类

/*
* 该类只能创建一个对象，构造器使用private修饰符
* */

class Test {
    private static Test instance;
    private Test () {}

    public static Test getInstance() {
        if (Test.instance == null) {
            Test.instance = new Test();
        }
        return Test.instance;
    }
}
public class Singleton {

    public static void main(String[] args) {
        Test t1 = Test.getInstance();
        Test t2 = Test.getInstance();
        System.out.println(t1 == t2);
    }
}
