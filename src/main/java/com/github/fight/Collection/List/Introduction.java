package com.github.fight.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// 集合框架之List
public class Introduction {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        // List是有角标的，根据角标添加元素
        list.add(1, "myxq");
        System.out.println(list);
        // 角标必须<=size
        // list.add(5, "sm");
        list.add(4, "mmk");
        System.out.println(list);

        // 根据角标获取元素
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // java.util.ConcurrentModificationException
        // 并发修改异常
        // 在迭代集合的过程中，是不允许直接修改集合结构
        // 可以使用迭代器的删除，去删除元素

        /**
         * 源码分析：
         *  调用it.next()
         *      modCount != expectedModCount
         *          modCount：集合修改次数
         *          expectedModCount： 迭代器找那个记录集合修改的次数
         *      两者不相等throw new ConcurrentModificationException();
         *
         *  通过集合获取迭代器时，modCount = expectedModCount
         *
         *  迭代器中的remove会又重新赋值expectedModCount = modCount;
         */

        // 遍历集合，如果元素等于c，就把它删除
        // 1.遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            // 2.取出对应的元素
            String str = (String) it.next();
            // 3.判断该元素是否等于c
            if (str.equals("c")) {
                // 4.等于c，就把c从集合中删除
                // list.remove("c");
                // 使用迭代器的remove
                it.remove(); // 删除当前正在迭代集合的元素（正在遍历ing...）
                // list.add("hhk"); // 导致modCount != expectedModCount
            }
        }
        System.out.println("去除c的list：" + list);

        System.out.println("====使用List自带的迭代器，在迭代过程中添加新元素====");
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        // 使用List自带的迭代器
        ListIterator it1 = list1.listIterator();
        // java.util.ArrayList$ListItr@1c20c684
        System.out.println(it1);
        while (it1.hasNext()) {
            String str = (String)it1.next();
            if (str.equals("c")) {
                // list1.add("c++");
                // 使用list的自有迭代器来添加新元素
                it1.add("c++");
            }
        }
        System.out.println("如果有c，添加c++后的list1:" + list1);

        while (it1.hasPrevious()) {
            System.out.println("preIndex: " + it1.previousIndex());
            // System.out.println(it1.previous()); // 注释这行会死循环
        }
    }
}
