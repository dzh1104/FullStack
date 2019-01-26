package com.github.fight.Collection.Map;

import java.util.HashMap;

// HashTable
public class HashTableDemo {
    /*
    * HashMap与HashTable的区别
    *   共同点：
    *       底层都是使用哈希算法
    *       都是双列集合
    *   区别：
    *       1.HashMap 是线程不安全，效率比较高，1.2版本才有
    *       2.HashTable 是线程安全，效率不高，1.0之前就有
    *       3.HashMap 是可以存储null
    *       4.HashTable 是不能存储null
    * */
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, 1);
        hm.put("a", null);
        System.out.println("hm = " + hm);

        /*HashTable<String, Integer> ht = new HashTable<>();
        ht.put(null, 1);
        ht.put("a", null);
        System.out.println("ht = " + ht);*/
    }
}
