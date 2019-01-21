package com.github.fight.Genericity;

// 自定义泛型方法demo

public class GenericMethodDemo {

    public static void main(String[] args) {
        Student2 student = new Student2();
        student.test("abc"); // class java.lang.String
        student.test(true); // class java.lang.Boolean 包装类型
        student.test(10); // class java.lang.Integer 包装类型

        String res = student.test("bbb");
        // Integer res1 = student.test("bbb");
        System.out.println(res);

        student.test();

        Student2.staticTest("hhh"); // class java.lang.String
    }
}


 class Student2 {
    // 在返回值前面加上<T> + 有T类型参数，调用时传入指定类型
    // 还可以把泛型作为返回值类型
    <T> T test(T param) {
        System.out.println(param.getClass());
        return param;
    }

    // 无参数的泛型方法，没有意义，无法在调用时指定类型
    <T> void test() {
        System.out.println("没有参数的泛型方法");
    }

    // 静态的泛型方法，但是静态方法不可以使用定义在类上的泛型
    static <T> T staticTest (T param) {
        System.out.println("静态的泛型方法");
        System.out.println(param.getClass());
        return param;
    }
}