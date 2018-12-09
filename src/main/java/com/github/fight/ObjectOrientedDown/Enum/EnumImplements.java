package com.github.fight.ObjectOrientedDown.Enum;

// 实现接口的枚举类

@FunctionalInterface
interface GenderDesc {

    void info();

}

// 枚举类不能显式使用abstract修饰，实现接口的枚举类，必须重写抽象方法
enum Gender implements GenderDesc {
    // MALE实际上是Gender匿名子类的实例
    // 花括号部分实际上是一个类体部分
    // 匿名子类在类体中重写了info()抽象方法
    MALE("男") {
        public void info() {

            System.out.println("这个枚举值代表男性");
        }
    }, FEMALE("女") {
        public void info() {

            System.out.println("这个枚举值代表女性");
        }
    };

    private final String name;

    Gender(String name) {

        this.name = name;
    }
}

public class EnumImplements {

}
