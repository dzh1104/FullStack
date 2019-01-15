package com.github.fight.BaseClassLibrary.FrequentlyUsedClass;

public class ObjectClass {

public static void main(String[] args) {
    StringDemo stringDemo = new StringDemo();
    // 不重写toString()返回值是"运行时类名@十六进制hashCode值": com.github.fight.BaseClassLibrary.FrequentlyUsedClass.StringDemo@1c20c684
    System.out.println(stringDemo);
}
}
