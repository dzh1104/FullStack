package com.github.fight.ObjectOrientedDown;

interface InterfaceA {
    int A = 20;
    void sayMsgA();
}

interface InterfaceB {
    int B = 30;
    void sayMsgB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    int C = 40;
    void sayMsgC();
}
public class InterfaceExtendsDemo {

    public static void main(String[] args) {

        System.out.println(InterfaceC.A);
        System.out.println(InterfaceC.B);
        System.out.println(InterfaceC.C);
    }
}
