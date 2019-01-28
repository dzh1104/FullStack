package com.github.fight.ProcessControlAndArray;

public class UseReturnEndCycle {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("i的值是: " + i);
            if (i == 1) {
                // return i;
                continue;
                // break;
                // return;
            }
        }
        // 不会执行，return结束的是整个方法，当然也结束了位于方法中的循环
        System.out.println("main方法结束咯？");
    }

}
