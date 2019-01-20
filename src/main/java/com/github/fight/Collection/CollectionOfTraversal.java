package com.github.fight.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 集合的遍历：从集合中一个一个取元素
public class CollectionOfTraversal {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("d");
        c.add("e");
        c.add("f");
        System.out.println(c);

        // 第一种方式：toArray() 把集合转成数组，通过数组的方式来遍历
        Object[] objArr = c.toArray();
        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i]);
        }

        Collection c1 = new ArrayList();
        c1.add(new Dog("wc"));
        c1.add(new Dog("wc2"));
        // 自动把数组当中的所有元素向上转型了
        Object[] objArr1 = c1.toArray();
        for (int i = 0; i < objArr1.length; i++) {
            // 问题：数组当中都是Object类型咯
            // System.out.println(objArr1[i].getName());
            System.out.println(((Dog) objArr1[i]).getName());
        }
        c1.add("e");
        c1.add("f");

        // 取交集 把交集的结果赋值给调用者
        // 返回结果：如果调用的集合改变了，就会返回true，否则返回false
        boolean b = c.retainAll(c1);
        System.out.println(b);
        System.out.println("retainAll取交集" + c);

        System.out.println(c);
        // 把c1中的元素全部合并到c当中
        // c.addAll(c1);

        c.add(c1);
        System.out.println(c);

        // 判断调用的集合是否全部包含传入的集合
        System.out.println(c.containsAll(c1));

        c.removeAll(c1);
        System.out.println(c);

        c.remove(c1);
        System.out.println(c);

        System.out.println("====以下是第二种遍历方式的内容====");
        // 2.迭代器遍历
        Collection c2 = new ArrayList();
        c2.add("d");
        c2.add("z");
        c2.add("h");

        Iterator it = c2.iterator(); // 放到Iterator中的元素会自动类型提升 Object
        // 获取迭代器中的元素
        // Object obj = it.next(); // 把当前游标的元素获取出来，当前游标往后走一位
        // System.out.println(obj);
        // Object obj1 = it.next();
        // System.out.println(obj1);
        // Object obj2 = it.next();
        // System.out.println(obj2);
        // // 判断迭代器当中是否还有元素
        // boolean res = it.hasNext();
        // System.out.println(res);
        // if (res) {
        //     Object obj3 = it.next();
        //     System.out.println(obj3);
        // }

        // 判断有没有元素
        while (it.hasNext()) {
            // 如果有，取出元素
            System.out.println(it.next());
        }

        Collection c3 = new ArrayList();
        c3.add(new Dog("kitty"));
        c3.add(new Dog("tom"));

        Iterator it1 = c3.iterator(); // 里面的对象都会自动提升为Object
        // java.util.ArrayList$Itr@1c20c684
        System.out.println(it1);
        while (it1.hasNext()) {
           Dog d = (Dog)it1.next(); // 强转
           d.show();
        }

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    void show () {
        System.out.println("我是狗狗" + this.name);
    }

}
