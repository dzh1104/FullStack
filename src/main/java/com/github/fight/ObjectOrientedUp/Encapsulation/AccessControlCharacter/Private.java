package com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter;

import static java.lang.System.*;

// 当前类访问权限
public class Private {
    /*
    * 范围: 类的内部
    * 对象: 类成员
    * */
    private int age;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public static void main(String[] args) {

        Private obj = new Private();
        // 在类内部可以访问private修饰的变量
        out.println(obj.age);
    }
}
