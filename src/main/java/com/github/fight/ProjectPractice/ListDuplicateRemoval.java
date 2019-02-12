package com.github.fight.ProjectPractice;

// Java实现对List去重

import java.util.*;

public class ListDuplicateRemoval {
    public static void main(String[] args) {
        // 方式一：使用for循环遍历去除List中的重复元素
        List originalList = ListDuplicateRemoval.getList();
        List tempList = new ArrayList();
        for (Object object : originalList) {
            if (!tempList.contains(object)) {
                tempList.add(object);
            }
        }
        System.out.println("tempList = " + tempList);

        // 方式二：使用Set去重
        Set set = new HashSet(originalList);
        List tempList1 = new ArrayList(set);
        System.out.println("tempList1 = " + tempList1);

        // 方式三：使用TreeSet去重
        TreeSet treeSet = new TreeSet(originalList);
        List tempList2 = new ArrayList();
        tempList2.addAll(treeSet);
        System.out.println("tempList2 = " + tempList2);


    }

    public static List getList() {
        List originalList = new ArrayList();
        originalList.add(1);
        originalList.add(3);
        originalList.add(3);
        originalList.add(5);
        originalList.add(7);
        originalList.add(7);
        originalList.add(13);
        return originalList;
    }
}
