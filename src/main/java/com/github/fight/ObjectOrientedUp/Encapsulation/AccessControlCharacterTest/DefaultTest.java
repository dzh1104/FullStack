package com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacterTest;

// 类是公共访问权限
import com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter.Default;
// 类是包访问权限
//import com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter.TestDefault;

public class DefaultTest {

    public static void main(String[] args) {

        Default obj = new Default();
        // 'age' is not public in 'com.github.fight.ObjectOrientedUp.Encapsulation.AccessControlCharacter.Default'.
        // Cannot be accessed from outside package
        // 成员变量是包访问权限
        // System.out.println(obj.age);

        // Cannot be accessed from outside package
        // TestDefault obj2 = new TestDefault();
    }
}
