package com.github.fight.BaseClassLibrary;

import java.util.Scanner;

// Scanner类
public class ScannerDemo {
    public static void main(String[] args) {
        // 使用户能够从 System.in 中读取一个数
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        /*
        nextlnt():只读取int值，就是只能读取整数类型的数据，
            如果输入了非整型的数据（浮点型字符串等）就会报错。
        nextFloat（）、nextDouble（）这些也是以此类推，只能读取符合该类型的数据。
         */

        /*
        next():只读取输入直到空格。它不能读两个由空格或符号隔开的单词。此外，next()在读取输入后将光标放在同一行中。(next()只读空格之前的数据,并且光标指向本行)

        nextLine():读取输入，包括单词之间的空格和除回车以外的所有符号(即。它读到行尾)。读取输入后，nextLine()将光标定位在下一行。
         */
        // Scanner input = new Scanner(System.in);
        // System.out.println("请输入一个字符串(中间能加空格或符号)");
        // String a = input.nextLine();
        // System.out.println("请输入一个字符串(中间不能加空格或符号)");
        // String b = input.next();
        // System.out.println("请输入一个整数");
        // int c;
        // c = input.nextInt();
        // System.out.println("请输入一个double类型的小数");
        // double d = input.nextDouble();
        // System.out.println("请输入一个float类型的小数");
        // float f = input.nextFloat();
        // System.out.println("按顺序输出abcdf的值：");
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(f);

        // Scanner类的常用方法2
        Scanner scan = new Scanner(System.in);  //构造Scanner类的对象scan，接收从控制台输入的信息
        System.out.println("请输入你的姓名");
        String name = scan.nextLine();//接收一个字符串，可以加除Enter以为的所有符号，包括空格和Tab
        System.out.println("请输入你的ID");
        String ID;
        while (scan.hasNextLine()) {// hasNextLine()方法判断当前是否有输入，当键盘有输入后执行循环
            if (scan.hasNextInt()) {// 判断输入的值是否为整数类型，当为整数类型时执行循环
                ID = scan.nextLine();
                System.out.println("你输入的姓名为：" + name);
                System.out.println("你输入的ID为：" + ID);
                break;
            } else {
                System.out.println("请输入数字哦！");
                ID = scan.nextLine();
                continue;
            }
        }
    }
}
