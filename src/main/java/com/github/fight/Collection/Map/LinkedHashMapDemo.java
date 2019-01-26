package com.github.fight.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

// LinkedHashMap
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
        HashMap<String, Integer> hm = new HashMap();
        hm.put("a", 20);
        hm.put("b", 20);
        hm.put("1", 20);
        hm.put("d", 20);
        // 无序
        System.out.println("hm = " + hm);
        lhm.put("a", 20);
        lhm.put("b", 20);
        lhm.put("1", 20);
        lhm.put("d", 20);
        // 有序
        System.out.println("lhm = " + lhm);




    }
}
