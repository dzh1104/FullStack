package com.github.fight.ObjectOrientedDown.Lambda;

// 方法引用
// Lambda表达式只有一条代码时，还可以使用方法引用和构造器引用，使得代码更加简洁

@FunctionalInterface
interface Converter {

    Integer convert(String from);

}

@FunctionalInterface
interface MyTest {

    String test(String a, int b, int c);

}

public class MethodReference {

    public static void main(String[] args) {
        // 使用Lambda表达式创建Converter对象
        Converter ct1 = from -> Integer.valueOf(from); Integer val1 = ct1.convert("99"); System.out.println(val1);

        // 方法引用代替Lambda表达式: 引用类方法
        // 函数式接口中被实现方法的全部参数传给该类方法作为参数
        Converter ct2 = Integer::valueOf; Integer val2 = ct2.convert("99"); System.out.println(val2);

        // 使用Lambda表达式创建Converter对象
        Converter ct3 = from -> "fkit.org".indexOf(from);
        // convert()方法体执行的就是Lambda表达式的代码块部分
        Integer val3 = ct3.convert("it"); System.out.println(val3);

        // 方法引用代替Lambda表达式: 引用特定对象的实例方法
        // 函数式接口被实现方法的全部参数传给该方法作为参数
        Converter ct4 = "fkit.org"::indexOf; Integer val4 = ct4.convert("it"); System.out.println(val4);

        // 使用Lambda表达式创建MyTest对象
        MyTest mt1 = (a, b, c) -> a.substring(b, c); String str1 = mt1.test("Java I Love you", 2, 9);
        System.out.println(str1);

        // 方法引用代替Lambda表达式: 引用某类对象的实例方法
        MyTest mt2 = String::substring; String str2 = mt2.test("Java I Love you", 2, 9); System.out.println(str2);
    }

}
