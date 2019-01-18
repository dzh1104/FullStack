package com.github.fight.Reflect;

// Class类的使用

// 博文：https://www.cnblogs.com/rocomp/p/4781987.html

/*
 * 万事万物皆对象，（当然，基本数据类型，静态成员不是面向对象（属于类的））
 * 所以我们创建的每一个类也都是对象，即类本身是java.lang.Class类的实例对象，但是这些对象都不需要new出来，因为java.lang.Class类的构造方法是私有的
 *
 * 官网解释说：c1,c2表示了Student类的类类型（class type)，万事万物皆对象，类也是对象，是Class类的实例对象，这个对象我们成为该类的类类型
 *
 * */
public class ClassTypeOfUse {
    public static void main(String[] args) {
        Student student = new Student();
        // 实际告诉我们任何一个类都有一个隐含的静态成员变量class（知道类名时用）
        Class c1 = Student.class;
        // 已知该类的对象通过getClass方法（知道对象时用）
        Class c2 = student.getClass();
        Class c3 = null;
        try {
            // 动态加载类，会有一个ClassNotFoundException异常
            c3 = Class.forName("com.github.fight.Reflect.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 原因是不管c1还是c2都代表了Student类的类类型，一个类只可能是Class类的一个实例对象
        // true
        System.out.println(c1 == c2);
        // true
        System.out.println(c1 == c3);

        try {
            // 我们完全可以通过类的类类型创建该类的对象实例，即通过c1或c2创建Student的实例。
            // 前提是必须要有无参的构造方法，因为该语句会去调用其无参构造方法。该语句会抛出异常。
            Student student1 = (Student)c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
