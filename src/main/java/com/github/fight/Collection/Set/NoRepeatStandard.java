package com.github.fight.Collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Set不重复的判断标准

/*
* 和List的不同：
*   List：判断重复是 equals为true，则为重复，见com.github.fight.Collection.List.ArrayListDemo中的去重方法
*   Set：先去判断对象hasCode()值是否相等，相等的话然后再去equals返回值，为true则为重复
* */
public class NoRepeatStandard {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat("kitty", 10));
        set.add(new Cat("kitty", 10));
        set.add(new Cat("tom", 10));
        set.add(new Cat("tom", 10));
        System.out.println(set);
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("执行equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    // 如果不重写hashCode()，则会执行从Object继承来的hashCode()，那么返回值将会是唯一的，那样就不会去执行equals方法
    @Override
    public int hashCode() {
        System.out.println("执行hashCode");
        return Objects.hash(name, age);
    }
}