package com.github.fight.Collection.List;

import java.util.Enumeration;
import java.util.Vector;

// Vector特有方法
public class VectorDemo {
    public static void main(String[] args) {

        // 使用很少，一般都使用ArrayList，从1.2开始并到List
        Vector vc = new Vector();
        vc.add("a");
        vc.add("b");
        System.out.println(vc);

        // 特有的一些方法，在1.2之前添加元素方式
        vc.addElement("c"); // synchronized修饰，方法都会加锁，更安全
        System.out.println(vc);

        // 获取到所有元素，1.2之前的方法
        Enumeration ea = vc.elements();
        while (ea.hasMoreElements()) {
            System.out.println(ea.nextElement());
        }


    }
}
