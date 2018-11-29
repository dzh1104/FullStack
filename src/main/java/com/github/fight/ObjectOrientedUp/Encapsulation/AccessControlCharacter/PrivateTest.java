package com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter;

// 测试private
public class PrivateTest {

    public static void main(String[] args) {
        Private obj = new Private();
        obj.setAge(18);
        // 访问其他类的私有变量，需要其提供的方法来实现
        // System.out.println(obj.age);
        System.out.println(obj.getAge());
    }
}
