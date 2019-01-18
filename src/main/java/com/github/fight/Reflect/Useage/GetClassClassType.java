package com.github.fight.Reflect.Useage;

public class GetClassClassType {
    public static void main(String[] args) {
        Class c1 = int.class;//int的类类型
        Class c2 = String.class;//String类的类类型，可以理解为编译生成的那个String.class字节码文件，当然，这并不是官方的说法
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getSimpleName());
        System.out.println(c4.getSimpleName());
        System.out.println(c5.getName());
    }
}
