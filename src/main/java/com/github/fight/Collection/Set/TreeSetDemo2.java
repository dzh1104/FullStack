package com.github.fight.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet：无序(不是按着添加的顺序取出的)
public class TreeSetDemo2 {
    public static void main(String[] args) {
        // 比较器
        // 默认情况下，比较时会调用对象的compareTo进行比较
        // 如果你传入比较器，就不会调用compareTo，会直接使用你传入的比较器进行比较

        // 默认是使用字母的顺序进行比较
        TreeSet<String> set = new TreeSet<>();
        set.add("aaaaaaa");
        set.add("z");
        set.add("wc");
        set.add("myx");
        set.add("cba");
        System.out.println("set = " + set);

        // 使用比较器进行比较
        // 1.实现一个接口Comparator
        // 2.定义一个类来实现该接口
        // 3.覆盖它里面的方法 compare
        // 4.在创建TreeSet对象时，传入比较器
        TreeSet<String> set1 = new TreeSet<>(new CompareLength());
        set1.add("aaaaaaa");
        set1.add("z");
        set1.add("wc");
        set1.add("myx");
        set1.add("cba");
        System.out.println("set1 = " + set1);



    }
}

// 泛型传入String，因为我们比较的是String类型
class CompareLength implements Comparator<String> {

    @Override
    /**
     * 第一个参数：代表当前正在添加的对象
     * 第二个参数：代表集合当中的对象
     */
    public int compare(String o1, String o2) {
       int res =  o1.length() - o2.length(); // 先比较长度，再去比较内容 值
        return res == 0 ? o1.compareTo(o2) : res;
    }
}
