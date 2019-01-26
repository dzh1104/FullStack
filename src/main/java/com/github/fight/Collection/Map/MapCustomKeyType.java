package com.github.fight.Collection.Map;

import java.util.HashMap;
import java.util.Objects;

// Map自定义对象作为key
public class MapCustomKeyType {
    public static void main(String[] args) {
        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", 1);
        // 已经存放相同的key，做的是一个修改操作
        objectObjectHashMap.put("a", 2);
        System.out.println("objectObjectHashMap = " + objectObjectHashMap);

        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("张三", 20), "北京");
        // 自定义对象作为key，需要重写equals方法
        hm.put(new Student("张三", 20), "深圳");
        hm.put(new Student("李四", 18), "上海");
        System.out.println("hm = " + hm);

    }
}

class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
