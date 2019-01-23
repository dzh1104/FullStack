package com.github.fight.BaseClassLibrary.String;

import java.util.Arrays;

// 字符串常用方法
public class CommonMethod {
    public static void main(String[] args) {
        String str = "abcd----cd";

        // 查询

        // 长度
        System.out.println(str.length());

        // 根据位置获取位置上某个字符
        char ch = str.charAt(2);
        System.out.println(ch);

        // 根据字符获取该 字符/字符串 在字符串中位置
        int pos = str.indexOf(99); // 99 是 字符c的 编码
        System.out.println("pos:" + pos);
        int pos1 = str.indexOf("c"); // 字符串c
        System.out.println("pos1:" + pos1);
        int pos2 = str.indexOf('c'); // 字符c
        System.out.println("pos2:" + pos2);
        int pos3 = str.indexOf("c", 4);
        System.out.println("pos3:" + pos3);
        int pos4 = str.lastIndexOf("c");
        System.out.println("pos4:" + pos4);

        // 判断

        // 字符串中是否包含某一个子串
        System.out.println(str.contains("cd"));
        /*
        特殊之处：indexOf(String str):可以索引str第一次出现位置，如果返回-1.表示该str不在字符串中存在。
        所以，也可以用于对指定判断是否包含。
            if(str.indexOf("aa")!=-1)
         */

        // 字符中是否有内容
        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        // System.out.println(null.isEmpty());

        // 字符串是否是以指定内容 开头/结尾
        System.out.println(str.startsWith("ab"));
        System.out.println(str.endsWith("ab"));

        // 判断字符串内容是否相同
        System.out.println(str.equals("abcd----cd"));
        System.out.println(str.equalsIgnoreCase("Abcd----cD")); // 忽略大小写

        // 转换

        // 将字符数组转成字符串
        char[] chs = {'a', 'b', 'c'};
        String str1 = new String(chs);
        System.out.println(str1);
        // 将字符数组中的一部分转成字符串
        String str2 = new String(chs, 1, 2);
        System.out.println(str2);
        /*
            静态方法实现
            static String copyValueOf(char[] data);
            static String copyValueOf(char[] data, int offset, int count)
            static String valueOf(char[] data):
         */
        String str3 = String.copyValueOf(chs);
        System.out.println(str3);

        String str4 = String.valueOf(chs);
        System.out.println(str4);

        // 将字符串转成字符数组
        char[] chs1 = str.toCharArray();
        System.out.println(chs1);

        // 将字节数组转成字符串
        byte[] bytes = {123, 45, 98, 99};
        String str5 = new String(bytes);
        System.out.println(str5);

        // 将字符串转成字节数组
        byte[] bytes1 = str5.getBytes();
        System.out.println(Arrays.toString(bytes1));

        // 将基本数据类型转成字符串
        String str6 = String.valueOf(8);
        String str7 = String.valueOf(8.9);
        // 实际开发中，使用字符串拼接
        String str8 = 8 + "";

        // 替换
        String oldStr = " ab cd ef ";
        // 去除所有的空格
        String newStr = oldStr.replace(" ", "");
        // String replace(CharSequence target, CharSequence replacement)
        // CharSequence是String的父接口
        System.out.println("newStr:" + newStr);

        // 切割
        String str9 = "a,b,c,d";
        String[] strArr = str9.split(",");
        System.out.println("strArr:" + Arrays.toString(strArr));

        // 子串。获取字符串中的一部分
        String parentStr = "abcd";
        String sonStr = parentStr.substring(1, 3);
        System.out.println("sonStr: " + sonStr);

        // 将字符串转成大写或则小写
        System.out.println(sonStr.toUpperCase());
        System.out.println(sonStr.toLowerCase());

        String str11 = " a b c d ";
        System.out.println("trim str11:" + str11.trim());

        // 对两个字符串进行自然顺序的比较
        // 按字典顺序比较两个字符串
        // public int compareTo(String anotherString)
    }
}
