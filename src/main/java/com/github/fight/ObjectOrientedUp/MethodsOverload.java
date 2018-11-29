package com.github.fight.ObjectOrientedUp;

// 方法重载
public class MethodsOverload {

    /*
    * 同一个类 多个 同名的方法，形参列表不同
    * 至于方法的其他部分，如方法返回值类型、修饰符等，与方法重载没有任何关系
    * */
    public static void test () {

        System.out.println("无参数的test方法");
    }

    public void test (String msg) {

        System.out.println("重载的test方法 " + msg);
    }

    public void say (String msg) {

        System.out.println("只有一个字符串参数的say方法");
    }

    // 不推荐重载形参长度可变的方法，没有意义，容易降低程序的可读性
    public void say (String... msg) {

        System.out.println("形参个数可变的say方法");
    }

    public static void main(String[] args) {
        MethodsOverload obj = new MethodsOverload();
        // obj.test(); // 应使用类调用静态方法
        MethodsOverload.test();
        obj.test("message");

        // 调用第二个say方法
        obj.say();
        obj.say("java", "javascript");
        // 调用第一个say方法
        obj.say("ddd");
        // 调用第二个say方法
        obj.say(new String[]{"zzz"});
    }
}
