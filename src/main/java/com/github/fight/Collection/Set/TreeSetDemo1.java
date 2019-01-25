package com.github.fight.Collection.Set;

import java.util.TreeSet;

// TreeSet：无序(不是按着添加的顺序取出的)
public class TreeSetDemo1 {
    public static void main(String[] args) {
        // TreeSet当中存放的类型必须是同一类型，否则就没有可比性了，会报错的
        // 自定义的类型对象不能直接添加到TreeSet中，想要添加到TreeSet中，必须要遵守一定的规则：实现接口Comparable<T>，覆盖实现一个方法compareTo

        TreeSet set = new TreeSet();
        set.add(10);
        // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        // set.add("2");

        TreeSet<Person> set1 = new TreeSet<>();
        // java.lang.ClassCastException: com.github.fight.Collection.Set.Person cannot be cast to java.lang.Comparable
        set1.add(new Person("张三", 20));
        set1.add(new Person("李四", 25));
        set1.add(new Person("王五", 22));
        set1.add(new Person("赵六", 21));
        set1.add(new Person("赵六1", 19));
        set1.add(new Person("赵六2", 18));
        set1.add(new Person("张三1", 20));
        System.out.println("set1 = " + set1);

    }
}

// 泛型传入Person，因为我们比较的是Person对象
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    // 如果返回0 则添加第一个元素
    // 如果是一个正数 都能添加到集合当中，顺序是按着添加的顺序
    // 如果是一个负数 都能添加到集合当中，顺序是按着添加的顺序倒序
    // 一般是按着一定规则，实现自定义的比较
    public int compareTo(Person o) {
        // return -2;
        // 先比较 age 再比较 name
        int num = this.age - o.age;
        /*if (num == 0) {
            // 字符串已实现了该方法compareTo()
            return this.name.compareTo(o.name);
        } else {
            return num;
        }*/
        return num == 0 ? this.name.compareTo(o.name) : num;
    }

}
