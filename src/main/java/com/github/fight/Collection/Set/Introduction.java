package com.github.fight.Collection.Set;

// Set接口的基础

/*
* Set和List一样，也继承于Collection,是集合的一种。和List不同的是，
* Set内部实现是基于Map的，所以Set取值时不保证数据和存入的时候顺序一致，
* 并且不允许空值，不允许重复值
* */

import java.util.HashSet;
import java.util.Set;

// 这个Set的特点，主要由其内部的Map决定的，可以负责任的说一句，Set就是Map的一个马甲
/*
public HashSet() {
    map = new HashMap<>();
}
 */
public class Introduction {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("1");
        set.add("2");
        set.add("3");
        // 无序 不重复
        System.out.println(set); // 并且已重写toString()
    }
}
