package com.github.fight.ExceptionAndHandle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionChain {

public static void main(String[] args) {
    
    System.out.println("请输入2个加数");
    int result;
    try {
        result = add();
        System.out.println("结果:" + result);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

//获取输入的2个整数返回
private static List<Integer> getInputNumbers() {
    
    List<Integer> nums = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    try {
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        nums.add(new Integer(num1));
        nums.add(new Integer(num2));
    } catch (InputMismatchException immExp) {
        throw immExp;
    } finally {
        scan.close();
    }
    return nums;
}

//执行加法计算
private static int add() throws Exception {
    
    int result;
    try {
        List<Integer> nums = getInputNumbers();
        result = nums.get(0) + nums.get(1);
    } catch (InputMismatchException immExp) {
        // throw new Exception(immExp);  // 链化:以一个异常对象为参数构造新的异常对象。
        throw new Exception("计算失败", immExp);  // 链化:以一个异常对象为参数构造新的异常对象。
    }
    return result;
}

}

/**
 * 请输入2个加数
 * k
 * java.lang.Exception: 计算失败
 * 	at com.github.fight.ExceptionAndHandle.ExceptionChain.add(ExceptionChain.java:49)
 * 	at com.github.fight.ExceptionAndHandle.ExceptionChain.main(ExceptionChain.java:15)
 * Caused by: java.util.InputMismatchException
 * 	at java.util.Scanner.throwFor(Scanner.java:864)
 * 	at java.util.Scanner.next(Scanner.java:1485)
 * 	at java.util.Scanner.nextInt(Scanner.java:2117)
 * 	at java.util.Scanner.nextInt(Scanner.java:2076)
 * 	at com.github.fight.ExceptionAndHandle.ExceptionChain.getInputNumbers(ExceptionChain.java:28)
 * 	at com.github.fight.ExceptionAndHandle.ExceptionChain.add(ExceptionChain.java:45)
 * 	... 1 more
 *
 * 	Casued by
 * 	*/