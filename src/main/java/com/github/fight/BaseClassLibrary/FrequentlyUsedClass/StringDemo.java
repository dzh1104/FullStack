package com.github.fight.BaseClassLibrary.FrequentlyUsedClass;

public class StringDemo {

    public static void main(String[] args) {
        String str = "java";
        byte[] tmpArr = str.getBytes();
        for(byte b : tmpArr) {
            System.out.println(b);
        }
    }
}
