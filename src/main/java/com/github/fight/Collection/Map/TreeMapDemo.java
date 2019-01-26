package com.github.fight.Collection.Map;

import java.util.TreeMap;

// TreeMap：做了排序
public class TreeMapDemo {
    public static void main(String[] args) {
        // 会对key进行排序
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("b", 2);
        tm.put("a", 1);
        tm.put("c", 3);
        System.out.println("tm = " + tm);
    }
}
