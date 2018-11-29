package com.github.fight.ObjectOrientedUp;

// 成员变量
public class MemberVariables {
    /*
    * 成员变量 根据有无static修饰区分为 类变量 和 实例变量
    * 无须显式初始化，系统会进行默认初始化
    * 默认初始化赋值规则同数组动态初始化时数组元素的赋值规则
    * */
    public String name;
    public static int eyeNum;

    public static void main(String[] args) {
        MemberVariables obj = new MemberVariables();
        System.out.println(obj.name);
        obj.name = "ddd";
        System.out.println(obj.name);
        System.out.println(MemberVariables.eyeNum);
        MemberVariables.eyeNum = 2;
        System.out.println(MemberVariables.eyeNum);
    }
}
