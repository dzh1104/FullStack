package com.github.fight.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

// LinkedHashSet：HashSet的子类
/*
* 看到Linked，可推测它底层是使用链表来实现的，是Set集合中，唯一的一个保证元素是怎么存怎么取的
* 能保证元素的唯一性
* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("1");
        set.add("e");
        // 有顺序
        System.out.println("set = " + set); // set = [a, b, 1, e]

        HashSet<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("1");
        set1.add("e");
        // 无顺序
        System.out.println("set1 = " + set1); // set1 = [a, 1, b, e]
    }
}
