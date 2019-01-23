package com.github.fight.Genericity;

// 泛型

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* JDK1.5 增加泛型支持在很大程度上都是为了让集合能记住其元素的数据类型
* 在没有泛型之前，一旦把一个对象"丢进"Java集合中，集合就会忘记其对象的类型，把所有的对象当成Object类型处理
* 当程序从集合中取出对象后，就需要进行强制类型转化，这种强制类型转换不仅使代码臃肿，而且容易引起ClassCastExecption异常
* 增加了泛型支持后的集合，完全可以记住集合中元素的类型，并可以在编译时检查集合中元素的类型，如果试图向集合中添加不满足类型要求的对象，
* 编译器就会提示错误。
* 增加泛型后的集合，可以让代码更加简洁，程序更加健壮(Java泛型可以保证如果在编译时没有发出警告，运行时就不会产生ClassCastException异常)
* */

/*
* 从Java5以后，Java引入了"参数化类型"的概念，允许程序在创建集合时指定集合元素的类型
* Java的参数化类型 被 称为 泛型 
* */

/*
* 所谓泛型，就是允许在定义类、接口、方法时使用 类型 形参，这个 类型 形参将在声明变量、创建对象、调用方法时
* 动态地指定(即传入实际的类型参数，也可以称为 类型 实参)。Java5改写了集合框架中的全部接口和类，为这些接口、类
* 增加了泛型支持，从而可以在声明集合变量、创建集合对象时传入类型实参
*
* 实质: 允许在定义接口、类时声明类型形参，类型形参在整个接口、类体内可当成类型使用，几乎所有可使用普通类型的地方都可以使用这种类型传参
* */
public class Introduction {

    public static void main(String[] args) {
        // 编译时不检查类型的异常
        // 创建一个只想保存字符串的List集合
        List strList1 = new ArrayList();
        strList1.add("JAVA");
        strList1.add("production");
        // "不小心"把一个Integer对象"丢进"集合
        // 导致引发ClassCastException异常，因为程序试图把一个Integer对象转换为String类型
        // strList1.add(5);
        strList1.forEach(str -> System.out.println(((String)str).length()));

        // 编译时进行类型检查
        // List<String> strList2 = new ArrayList<String>();
        // Java自动推断出ArrayList的<>里应该是String
        List<String> strList2 = new ArrayList<>();
        strList2.add("JS");
        strList2.add("dev");
        // 下面代码将引起编译错误，编译器提示错误
        // strList2.add(5);
        strList2.forEach(str -> System.out.println(str.length()));

        // Java自动推断出HashMap的<>应该是String, List<String>
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        // List<String> 一个新的类型，List<String>可以当成是特殊的List子接口，但是这种子类物理上不存在
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空", schools);
        schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}
