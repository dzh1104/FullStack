package com.github.fight.Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map基本概念
 *  映射关系
 *  A集合 B集合 (ArrayList LinkedList Vector HashSet LinkedHashSet TreeSet)
 *  A集合当中的每一个元素称它是一个key，并且元素不可重复(Set)
 *  B集合当中的每一个元素称它是一个value，元素可重复(List)
 *  Map 当做是一个字典(dict)
 *  key-value 称为 entry 键值对
 *
 *  双列集合
 */
public class Introduction {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        // 将指定的值与此映射中的指定键关联（可选操作）
        // 往AB两个集合当中添加元素，并且关联在一起(value会跟着Key走)
        // Map当中的元素并不是有序的

        // 添加功能
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        System.out.println("map = " + map);

        // 取得A集合
        Set<String> set = map.keySet();
        System.out.println("set = " + set);

        // 获取B集合
        Collection<Object> collection = map.values();
        System.out.println("collection = " + collection);
    }
}
