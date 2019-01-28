package com.github.fight.ObjectOrientedUp;

// 局部变量
public class LocalVariable {
    /*
     * 根据定义形式不同，分为如下三种:
     *  1)形参: 在定义方法签名时定义的变量，作用域: 在整个方法内有效；
     *  2)方法局部变量: 在方法体内定义的局部变量，作用域: 从定义该变量的地方生效，到该方法结束时失效；
     *  3)代码块局部变量: 在代码块中定义的局部变量，作用域: 从定义该变量的地方生效，到该代码块结束时失效
     *
     *  除了形参之外，都必须显示初始化
     *  形参的初始化在调用该方法时，由系统完成，形参的值由方法的调用者指定
     *
     *  局部变量总是保存在所在方法的栈内存中，栈内存中的变量无须系统垃圾回收，随着方法或代码块的运行结束而销毁
     *
     *  因为局部变量只保存基本类型的值或者对象的引用，因此局部变量所占的内存区通常比较小
     */
    public static void main(String[] args) {
        int age;
        // Variable 'age' might not have been initialized
        // 必须先初始化才可以使用
        // System.out.println(age);
    }
}
