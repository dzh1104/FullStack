package com.github.fight.Genericity;

import java.util.ArrayList;
import java.util.List;

// 类型通配符
public class TypeWildcard {
    // 此处使用List接口时没有传入实际类型参数，这将引起泛型警告
//     public void test(List c) {
    // 解决方法: 为List接口传入实际的类型参数，因为List集合里的元素类型是不确定的，将上面方法改为如下形式:
//     public void test(List<Object> c) {
    // 使用类型通配符 ?，带通配符的List表示它是 各种泛型List的父类
    public void test(List<?> c) {
        for(int i = 0; i < c.size(); i++) {
            System.out.println("元素是Object的实例？" + c.get(i).toString() + (c.get(i) instanceof Object));
            System.out.println("元素是String的实例？" + c.get(i).toString() + (c.get(i) instanceof String));
        }
    }

    public static void main(String[] args) {
        TypeWildcard obj = new TypeWildcard();
        // 创建一个List<String>对象
        List<String> strList = new ArrayList<>();
        strList.add("JAVA");
        strList.add("JS");
        // 将strList作为参数来调用前面的test方法
        // 编译错误，表明List<String>对象不能被当成List<Object>对象使用
        // 也就是说List<String>类 并不是 List<Object>类的 子类
        // Error:(28, 19) java: 不兼容的类型: java.util.List<java.lang.String>无法转换为java.util.List<java.lang.Object>
         obj.test(strList);

         List<?> l1 = new ArrayList<String>();
         // 编译错误
         // 程序无法确定l1集合中元素的类型，根据List接口定义: add()方法有类型参数E作为集合的元素类型，所以
         // 传给add的参数必须是E类的对象或者其子类的对象。但此时使用了通配符，不知道E是什么类型，所以程序无法将任何对象"丢进"该集合
         // l1.add("JAVA");
         // l1.add(new Object());
        
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(6);
        obj.test(intList);
    }
}

class ArrayErr {

public static void main(String[] args) {
    // 定义一个Integer数组
    Integer[] ia = new Integer[5];
    // 可以把一个Integer[]数组赋值给Number[]变量
    Number[] na = ia;
    // 下面代码编译正常，但运行时会引发ArrayStoreException异常
    // 因为0.5不是Integer
    na[0] = 0.5;
    
    /**
     * 允许把Integer数组赋值给Number[]变量存在缺陷
     * 因此Java在设计泛型时进行了改进，它不再允许List<Integer>对象赋值给List<Number>变量
     *
     * 数组和泛型有所不同，假设Foo是Bar的一个子类型(子类或子接口)，那么Foo[]依然是Bar[]的子类型；
     * 但是G<Foo>不是G<Bar>的子类型
     * */
}
}
