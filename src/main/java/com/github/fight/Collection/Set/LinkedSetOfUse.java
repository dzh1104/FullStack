package com.github.fight.Collection.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

// LinkedSet的一个使用demo
/*
* aaabbbbbccc
* abc
* */
public class LinkedSetOfUse {
    public static void main(String[] args) {
        /*
         * 需求：
         *   获取用户输入的字符串，并且按着用户输入的顺序、不可重复
         * */
        // 1.获取从键盘上输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        System.out.println("line = " + line);
        // 2.拿字符串当中的每一个字符
        char[] chArr = line.toCharArray();
        System.out.println("chArr = " + Arrays.toString(chArr));
        // 3.取出每一个元素，添加到一个可以去重的集合当中
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char c : chArr) {
            linkedHashSet.add(c);
        }
        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}
