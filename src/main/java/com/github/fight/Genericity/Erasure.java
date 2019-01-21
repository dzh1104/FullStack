package com.github.fight.Genericity;

import java.util.ArrayList;
import java.util.List;

// 泛型擦除
public class Erasure {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        // list.add(5);

        List list1 = null;
        list1 = list; // 把list中的泛型擦除掉
        list1.add(5);
        list1.add("mm");


    }
}
