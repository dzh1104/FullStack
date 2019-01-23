package com.github.fight.BaseClassLibrary.String;

import java.util.ArrayList;
import java.util.List;

// 字符串常用方法应用demo
public class CommonMethodDemo {
    public static void main(String[] args) {
        /*
        * 需求：
        *   从下面的字符串中，找出所有以hello开头的文件的后缀
        * */
        String str = "record.txt;request.js;hello.java;utils.md;hello.js;style.less;hello.txt.zip";
        String[] strArr = str.split(";");
        List<String> suffixNames = new ArrayList<>();
        for (String s : strArr) {
            if (s.startsWith("hello")) {
                int pos = s.lastIndexOf(".");
                suffixNames.add(s.substring(pos));
            }
        }
        System.out.println(suffixNames);

        /*
        * 需求：
        *   将首字母大写
        * */
        String str1 = "abcd";
        String fCh = str1.substring(0, 1);
        fCh = fCh.toUpperCase();
        String restStr = str1.substring(1);
        String res = fCh + restStr;
        System.out.println(res);
    }
}
