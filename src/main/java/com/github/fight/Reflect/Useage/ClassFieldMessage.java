package com.github.fight.Reflect.Useage;

public class ClassFieldMessage {
    public static void main(String[] args) {
        ClassUtil.printFieldMessage("hello");
        System.out.println("=============");
        ClassUtil.printFieldMessage(new Integer(1));
    }
}
