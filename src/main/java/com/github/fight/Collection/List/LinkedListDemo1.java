package com.github.fight.Collection.List;

import java.util.LinkedList;
import java.util.ListIterator;

// LinkedList数据结构: 基于链表实现
// 查询和修改慢，插入和删除，比较快
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        ListIterator it = list.listIterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // 特有
        // 往第一个位置添加元素
        list.addFirst("f");
        list.addFirst("1");
        System.out.println(list);
        // 往最后一个位置添加元素
        list.addLast("jl");
        list.addLast("8");
        System.out.println(list);
        // 移除第一个元素
        list.removeFirst();
        System.out.println(list);
        // 移除最后一个元素
        list.removeLast();
        System.out.println(list);

        // 根据角标获取元素
        // linkedList查询是比较慢的
        System.out.println(list.get(0));

    }
}
