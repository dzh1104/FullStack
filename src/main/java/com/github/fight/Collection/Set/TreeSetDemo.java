package com.github.fight.Collection.Set;

import java.util.TreeSet;

// TreeSet：无序(不是按着添加的顺序取出的)
public class TreeSetDemo {
    public static void main(String[] args) {
        /*
         * 对添加的元素会进行排序，里面也是可以保证元素唯一的
         * */

        // 数字大小
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(2);
        boolean res = treeSet.add(2);
        System.out.println("res = " + res);
        treeSet.add(9);
        treeSet.add(6);
        System.out.println("treeSet = " + treeSet);

        // 字母顺序
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("a");
        treeSet1.add("b");
        treeSet1.add("d");
        treeSet1.add("c");
        treeSet1.add("g");
        System.out.println("treeSet1 = " + treeSet1);

        // 汉子是按照Unicode码 -> 里面已经包含了ASSIC码
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("合");
        treeSet2.add("肥");
        treeSet2.add("欢");
        treeSet2.add("迎");
        treeSet2.add("你");
        System.out.println("treeSet2 = " + treeSet2);

        System.out.println('合' + 0);
        System.out.println('肥' + 0);
        System.out.println('欢' + 0);
        System.out.println('迎' + 0);
        System.out.println('你' + 0);

        TreeSet<String> treeSet3 = new TreeSet<>();
        treeSet3.add("aa");
        treeSet3.add("ac");
        treeSet3.add("aca");
        treeSet3.add("aba");
        System.out.println("treeSet3 = " + treeSet3);

    }
}
