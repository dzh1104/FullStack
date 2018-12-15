package com.github.fight.Genericity;

import java.util.ArrayList;
import java.util.List;

// 类型通配符
public class TypeWildcard {
    // 此处使用List接口时没有传入实际类型参数，这将引起泛型警告
    // public void test(List c) {
    // 解决方法: 为List接口传入实际的类型参数，因为List集合里的元素类型是不确定的，将上面方法改为如下形式:
    // public void test(List<Object> c) {
    // 使用类型通配符 ?，带通配符的List表示它是各种泛型List的父类
    public void test(List<?> c) {
        for(int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
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
         obj.test(strList);

         List<?> l1 = new ArrayList<>();
         // 编译错误
         // 程序无法确定l1集合中元素的类型，根据List接口定义: add()方法有类型参数E作为集合的元素类型，所以
         // 传给add的参数必须是E类的对象或者其子类的对象。但此时使用了通配符，不知道E是什么类型，所以程序无法将任何对象"丢进"该集合
         // l1.add("JAVA");
         // l1.add(new Object());
    }
}
