package com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter;

// 包访问权限
public class Default {
    /*
    * 范围: 类内部 类外部
    * 对象: 类成员 外部类
    * */

    // 包访问权限
    int age = 18;
}

// 包访问权限
class TestDefault {
    void say () {

        System.out.println("这是default访问控制级别的类的default访问控制级别的方法");
    }
}
