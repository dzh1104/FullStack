package com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacterTest;

import com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter.Protected;

class Test extends Protected {
    public void test () {
        // 子类内部可以访问 父类中被protected修饰的方法
        say();
        this.say();
        super.say();
    }

    public void say () {

        System.out.println("重写父类的被protected修饰的say方法");
    }
}

public class ProtectedTest {

    public static void main(String[] args) {

        Protected obj = new Protected();
        // 'say()' has protected access in 'com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter.Protected'
        // ProtectedTest并非Protected的子类，无法访问say方法
        // obj.say();

        Test obj2 = new Test();
        // 子类Test中可以访问say 在子类内部
        // obj2.say();
        obj2.test();
    }
}
