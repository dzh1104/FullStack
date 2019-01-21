package com.github.fight.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 数组与集合的转换
public class ListArrayConvert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
       // 把数组转成集合
       List<int[]> list =  Arrays.asList(arr);
        // 基本类型转成集合时，是把基本类型的数组当成是 一个 对象
        // 因此开发过程中，不会把基本类型的数组转成集合，没有意义
        System.out.println(list); // [[I@1c20c684]
        System.out.println(list.size()); // 1
        // java.lang.UnsupportedOperationException
        // 数组转成集合后还是不能添加和添加元素
        // list.add(50);
        // list.remove(1);
        // 那为何还要转？因为转过后，可以用面向对象的方式操作数组，除了不能添加和删除元素之外，集合当中的其他东西都是可以使用的，size()...

        // 引用类型的数组才会转成集合
        Integer[] arr1 = {10, 20, 30, 40};
        List<Integer> list1 = Arrays.asList(arr1);
        System.out.println(list1); // [10, 20, 30, 40]

        // 集合转成数组
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        Object[] arr2 = list2.toArray();
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        // 指定数组的长度，如果小于集合的长度，则以集合的长度为准，大于的话，以指定的为准
        String[] arr3 = list2.toArray(new String[10]); // 指定类型
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr3));



    }
}
