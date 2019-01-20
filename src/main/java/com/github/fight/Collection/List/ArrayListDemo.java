package com.github.fight.Collection.List;

import java.util.ArrayList;
import java.util.ListIterator;

// ArrayList数据结构: 基于数组实现
// 查询和修改快，增加删除慢
public class ArrayListDemo {
    /**
     * 去重
     * @param list 原数据
     * @return 去重后的数据
     */
    static ArrayList getSingleEle(ArrayList list) {
        // 1.创建一个空的集合
        ArrayList newList = new ArrayList();
        // 2.依次取出每一个元素
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            // 3.每取出一个元素，要先判断新集合当中，是否已经包含了该元素
            Object obj = it.next();
            // 4.如果已经包含该元素，就不把该元素添加到新集合中，不包含时才添加
            if (!newList.contains(obj)) { // contains可以判断一个集合当中是否包含某一个对象，标准：底层使用的是对象的equals方法，比较的是地址
                // 不包含
                newList.add(obj);
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        // 去除集合当中重复的元素
        list = ArrayListDemo.getSingleEle(list);
        System.out.println(list);

        ArrayList list1 = new ArrayList();
        list1.add(new Student("zhangsan", 20));
        list1.add(new Student("zhangsan", 20));
        list1.add(new Student("lisi", 21));
        System.out.println(list1);
        // 做对象的对比，不想让其对比地址，就必须要覆盖equals方法，根据自己的需求来定义什么时候相等
        list1 = ArrayListDemo.getSingleEle(list1);
        System.out.println(list1);

        System.out.println(list1.get(0));
    }
}

