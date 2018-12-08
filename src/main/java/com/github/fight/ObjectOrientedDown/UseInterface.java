package com.github.fight.ObjectOrientedDown;

// 使用接口

/*
* 接口不能用于创建实例
* 用途:
*   1)定义变量，也可用于强制类型转换
*   2)调用接口中定义的静态常量
*   3)被其他类实现
*  一个类可以实现一个或多个接口，继承一个父类，继承使用extends，实现使用implements，实现在继承之后
*  因为一个类可以实现多个接口，这也是Java为单继承灵活性不足所做的补充
*  一个类实现了一个或多个接口之后，这个类必须完全实现这些接口里所定义的全部抽象方法(也就是重写这些抽象方法)；否则，
*  该类将保留父接口那里继承到的抽象方法，该类也必须定义成抽象类
*  一个类实现某个接口时，该类将会获得接口中定义的静态常量、方法等，因此可以把实现接口理解为一种特殊的集继承，相当于实现类
*  继承了一个彻底抽象的类(相当于除了默认方法外，所有方法都是抽象方法的类)
* */

// public abstract class UseInterface extends Singleton implements InterfaceA, InterfaceB, InterfaceC {
// }
public class UseInterface extends Singleton implements InterfaceA, InterfaceB, InterfaceC {

    /*
    * 实现类重写的抽象方法，必须是public访问权限，因为接口的抽象方法是public
    * */
    @Override
    public void sayMsgA() {

        System.out.println("sayMsgA");
    }

    @Override
    public void sayMsgB() {

    }

    @Override
    public void sayMsgC() {

    }

    public static void main(String[] args) {
        UseInterface ui = new UseInterface();
        System.out.println(UseInterface.C);
        ui.sayMsgA();
    }

}
