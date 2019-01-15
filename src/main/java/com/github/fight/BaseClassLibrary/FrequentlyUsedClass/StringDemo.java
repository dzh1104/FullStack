package com.github.fight.BaseClassLibrary.FrequentlyUsedClass;

public class StringDemo {

private String name;

private int age;
    public static void main(String[] args) {
        String str = "java";
        byte[] tmpArr = str.getBytes();
        for(byte b : tmpArr) {
            System.out.println(b);
        }
    }

@Override
public String toString() {
    
    return "StringDemo{" + "name='" + name + '\'' + ", age=" + age + '}';
}

}
