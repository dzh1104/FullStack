package com.github.fight.Collection.List;

import java.util.LinkedList;

// LinkedList实现栈结构存储
public class LinkedListDemo2 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}

class Stack {
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    // 1.入栈：在集合最后添加一个元素
    void push(Object obj) {
        this.linkedList.addLast(obj);
    }

    // 2.出栈：把集合最后一个元素移除
    void pop() {
        this.linkedList.removeLast();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
