package com.github.fight.ObjectOrientedUp;

public class StaticModifier {

    public static void getMessage() {

        System.out.println("简单的getMessage方法");
    }

    public static void main(String[] args) {
        /*
         * 静态成员不能直接访问非静态成员
         *
         * info() => this.info()
         * getMessage() => StaticModifier.getMessage()
         *
         * 对于static修饰的方法而言，则可以使用类来直接调用该方法，如果static修饰的方法中使用this关键字，则这个关键字就无法指向合适的对象。
         * 所以，static修饰的方法中不能出现this引用。故static修饰的方法不能使用this引用，即static修饰的方法不能访问不使用static修饰的普通成员
         *
         * 调用static修饰的方法的主调总是类本身，如果允许在static修饰的方法中出现this引用，那将导致this无法引用有效的对象
         * */
        // info();
        getMessage();

        // 可以在static方法中实例化一个对象来调用这个方法
        StaticModifier obj = new StaticModifier();
        obj.info();
    }

    public void info() {

        System.out.println("简单的info方法");
    }

}
