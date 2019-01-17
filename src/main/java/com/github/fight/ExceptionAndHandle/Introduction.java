package com.github.fight.ExceptionAndHandle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// 学习文章：http://www.importnew.com/26613.html
public class Introduction {

public static void main(String[] args) {
    
    System.out.println("----欢迎使用命令行除法计算器----");
    CMDCalculate();
}

public static void CMDCalculate() {
    
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int result = devide(num1, num2);
    System.out.println("result:" + result);
    scan.close();
}

public static int devide(int num1, int num2) {
    
    return num1 / num2;
}

public void testException() throws IOException {
    //FileInputStream的构造函数会抛出FileNotFoundException
    FileInputStream fileIn = new FileInputStream("./a.txt");
    
    int word;
    //read方法会抛出IOException
    while ((word = fileIn.read()) != -1) {
        System.out.print((char) word);
    }
    //close方法会抛出IOException
    fileIn.close();
}

public void testException2() {
    try {
        //FileInputStream的构造函数会抛出FileNotFoundException
        FileInputStream fileIn = new FileInputStream("./a.txt");
        
        int word;
        //read方法会抛出IOException
        while ((word = fileIn.read()) != -1) {
            System.out.print((char) word);
        }
        //close方法会抛出IOException
        fileIn.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}

/**
 * ----欢迎使用命令行除法计算器----
 * ji
 * Exception in thread "main" java.util.InputMismatchException
 * at java.util.Scanner.throwFor(Scanner.java:864)
 * at java.util.Scanner.next(Scanner.java:1485)
 * at java.util.Scanner.nextInt(Scanner.java:2117)
 * at java.util.Scanner.nextInt(Scanner.java:2076)
 * at com.github.fight.ExceptionAndHandle.Introduction.CMDCalculate(Introduction.java:17)
 * at com.github.fight.ExceptionAndHandle.Introduction.main(Introduction.java:11)
 *
 * ----欢迎使用命令行除法计算器----
 * 4
 * 0
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at com.github.fight.ExceptionAndHandle.Introduction.devide(Introduction.java:26)
 * at com.github.fight.ExceptionAndHandle.Introduction.CMDCalculate(Introduction.java:19)
 * at com.github.fight.ExceptionAndHandle.Introduction.main(Introduction.java:11)
 */
