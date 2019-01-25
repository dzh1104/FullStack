package com.github.fight.Collection.Set;

import java.util.HashSet;
import java.util.Random;

// HashSet的一个使用demo
public class HashSetOfUse {
    public static void main(String[] args) {
        /*
         * 需求：
         *   获取1到20之间的随机数
         *   获取10个
         *   不允许有重复
         * */

        // 1.使用Random来生成随机数
        Random random = new Random();
        // 2.创建存放生成结果的集合，使用HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        // 3.当hashSet.size大于10的时候，就不放，否则一直生成往里面放
        while (hashSet.size() < 10) {
            // 4.生成1到20之间的随机数
            int res = random.nextInt(20) + 1;
            // 5.添加到集合当中
            hashSet.add(res);
        }
        System.out.println("hashSet = " + hashSet);
    }
}
