package com.github.fight.Genericity;

// 不存在泛型类

import java.util.ArrayList;
import java.util.List;

/*
* 前面提到过可以把ArrayList<String>类当成ArrayList的子类，事实上，ArrayList<String>类也确实像一种
* 特殊的ArrayList类: 该ArrayList<String>对象只能添加String对象作为集合元素
* 但实际上，系统并没有为ArrayList<String>生成新的class文件，而且也不会把ArrayList<String>当成新类来处理
* */

/*
* 不管泛型的实际类型参数时什么，它们在运行时总有同样的类(class)，对于Java来说，它们依然被当成同一个类处理，在内存中也只占用一块内存，
* 因此静态方法、静态初始化块或者静态变量的声明和初始化块中不允许使用类型形参
* */

class R<T> {
    // 不能在静态变量声明中使用类型形参
    // static T info;
    public void foo(T msg) {}
    // 不能在静态方法声明中使用类型性参数你
    // public static void bar(T msg) {}
}
public class NotGendricClass {

    public static void main(String[] args) {
        // 分别创建List<String>对象 和 List<Integer>对象
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        // 调用getClass()方法来比较l1和l2的类是否相等
        // 返回true
        System.out.println(l1.getClass() == l2.getClass());
    }
}
