package com.github.fight.ObjectOrientedDown;

// 接口

// 修饰符可以是public或者省略(default)
// 一个接口可以有多个直接父接口，但接口只能继承接口，不能继承类
// 接口里不能包含构造器和初始化块定义，因此接口里定义的成员变量只能在定义时指定默认值
// 接口里可以包含成员变量(只能是静态常量)、方法(只能是抽象方法、类方法或默认方法)、内部类(包含内部接口、枚举)定义
// 接口里所有的成员都是public访问权限，省略的话，系统会自动指定为public
// 如果不是定义默认方法，系统将自动为普通方法增加abstract修饰符
// 接口里的普通方法不能有方法体，但类方法、默认方法都必须要有方法体
// 接口里定义的内部类、内部接口、内部枚举默认采用public static修饰符，不管定义时是否制定这两个修饰符，系统都会自动使用public static对它们进行修饰
interface Output {
    // 静态常量 + public + 定义初始化
    int MAX_CACHE_LINE = 50;
    // public static final int MAX_CACHE_LINE = 50;

    // 抽象方法 + public + 无方法体
    // void out();
    public abstract void out();
    // redundant 多余的public abstract
    void getData(String msg);

    // 接口里的默认方法，需要使用default修饰
    // 默认方法没有static修饰，因此不能直接使用接口来调用默认方法，需要使用接口的实现类的实例来调用这些默认方法
    // 默认方法不能使用static修饰符
    // + public
    public default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println("信息: " + msg);
        }
    }

    default void test() {

        System.out.println("默认的test方法");
    }

    // 类方法，使用static修饰符 + 方法体 + public
    public static String staticTest() {
        return "接口里的类方法";
    }
}

public class InterfaceDemo {

}
