package com.github.fight.Collection.Map;

import java.util.HashMap;

// Map的一个使用demo
public class MapOfUse {
    public static void main(String[] args) {
        /*
         * 需求：
         *   同级字符串中每个字符串出现的次数
         * */
        String str = "aaabcdsfassssdabbsscsxx";

        // 1.把字符串转成一个数组
        char[] arr = str.toCharArray();

        // 2.创建一个Map
        HashMap<Character, Integer> hm = new HashMap<>();
        // 3.从数组当中取出每一个字符出来
        for (char c : arr) {
            // 每取出一个元素
            // 判断一下，该元素是否在map当中存储Key
            if (!hm.containsKey(c)) {
                // 如果没有：把当前的字符当做key存储，value设置为1
                hm.put(c, 1);
            } else {
                // 如果已经有了，就去修改对应的value，在原来的value上加1
                hm.put(c, hm.get(c) + 1);
            }
        }
        System.out.println("hm = " + hm);
    }
}
