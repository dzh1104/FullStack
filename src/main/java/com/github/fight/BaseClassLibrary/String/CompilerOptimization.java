package com.github.fight.BaseClassLibrary.String;

// 编译优化
public class CompilerOptimization {
    public static void main(String[] args) {
        String str = "abcd";
        String str1 = "a" + "b" + "c" + "d";
        String str2 = "ab" + "cd";
        String str3 = new String("abcd");
        String tmp = "ab";
        String str4 = tmp + "cd";
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
    }
}
