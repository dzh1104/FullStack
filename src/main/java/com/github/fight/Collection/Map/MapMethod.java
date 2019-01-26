package com.github.fight.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map的常用方法
public class MapMethod {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        // 1.添加功能
        Object res = map.put("张三", 20);
        Object res1 = map.put("李四", 21);
        Object res2 = map.put("王五", 22);
        // 如果key值是第一次添加，返回值就是null
        System.out.println("res = " + res);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("map = " + map);
        // 添加的Key并不是第一次添加，就用value把以前的值给替换掉，返回以前的值，即被替换的值
        // 2.更新功能
        Object res3 = map.put("王五", 26);
        System.out.println("res3 = " + res3);
        System.out.println("map = " + map);

        // 4.长度功能
        // map当中有几个entry
        System.out.println("map长度 = " + map.size());

        // 5.获取功能
        // 5.1获取一个entry
        // 根据指定的key，可以获取相关联的value
       Object value = map.get("张三");
       System.out.println("value = " + value);
        // 5.2获取所有entry
        // 通过遍历来获取，map当中没有迭代器，集合没有迭代器，就不可以使用快速遍历(foreach)

        // 取出所有的key
        Set<String> allKeys = map.keySet();
        // 取出每一个key 获取对应的value
        // Set有迭代器
       Iterator<String> it = allKeys.iterator();
        while (it.hasNext()) {
            // 取出key
            String key = it.next();
            // 通过key，从Map中获取value
            Object val = map.get(key);
            System.out.println(key +" = " + val);
        }

        System.out.println("----");

        // Set能使用迭代器，就能使用forach，下面通过foreach来实现一次
        for (String key : map.keySet()) {
            Object val = map.get(key);
            System.out.println(key +" = " + val);
        }

        System.out.println("----");

        // 另一种实现方式
        // 获取所有的key-value对象 Entry对象
        // Entry是定义在Map内部的接口
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        // 使用Set的迭代器，遍历每一个Entry对象
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            // 取出每一个Entry对象
            Map.Entry<String, Object> next = iterator.next();
            // 取出Entry对象的key
            String key = next.getKey();
            // 取出Entry对象的value
            Object value1 = next.getValue();
            System.out.println(key + " = " + value1);
        }

        System.out.println("----");

        // 使用快速遍历foreach
        for (Map.Entry<String, Object> stringObjectEntry : entrySet) {
            System.out.println(stringObjectEntry.getKey() + " = " + stringObjectEntry.getValue());
        }


        // 3.删除功能
        // 3.1根据key来删除entry
        Object res4 = map.remove("李四");
        System.out.println("res4 = " + res4);
        System.out.println("map = " + map);
        // 3.2清空map当中所有的entry
        map.clear();
        System.out.println("map = " + map);



    }
}
