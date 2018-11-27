package com.github.fight.DataTypeAndOperator;

public class PrimitiveTypeTransform {

    public static void main(String[] args) {

        /**
         * 基本类型的类型转换
         *
         * 不同的基本类型的值经常需要进行相互转换。在Java语言中，提供的7中数值类型之间可以相互转换
         */

        /**
         * 自动类型转换
         * 现象: 如果系统支持把某种基本类型的值赋值给另一种基本类型的变量，则这种方式被称为自动类型转换。
         * 规则: 当把一个表数范围小的数值或变量 直接 赋值给 另一种表数范围大的变量时，系统可以进行自动类型转换；否则就需要强制转换
         */

        int a = 6;
        float f = a;
        System.out.println(f);

        byte b = 9;
        // char c = b; // byte类型不能自动转换为char类型

        double d = b;
        System.out.println(d);

        /**
         * 基本类型 => String (也是自动类型转换)
         * 当把任何基本类型的值和字符串进行连接运算时，基本类型的值将自动转换为字符串类型
         * 虽然字符串类型不是基本类型，而是引用类型。
         */
        char c1 = 'A';
        String str1 = c1 + "demo";
        System.out.println(str1);

        System.out.println(3 + 4.0 + "Hello");

        int iValue = 233;
        byte bValue = (byte) iValue;
        System.out.println(bValue);

        double dValue = 3.98;
        int tol = (int) dValue;
        System.out.println(tol);

        /**
         * 999999999999的大小超出了int类型的表数范围，如果直接使用(long)999999999999，进行强制类型转换会引发错误integer number too
         * large，所以要使用L后缀，强制使用long类型，999999999999L long类型
         * 如果整数值比较小，没有超出int类型的表数范围，不用加后缀L，也可以，当然，加也可以，系统会进行自动类型转换
         */
        // double dValue2 = (long)999999999999;
        double dValue2 = 999999999999L;

        /**
         * 5.6默认double类型
         * 将5，6赋值给一个float类型的变量将会导致错误，必须使用强制类型转换或者加F后缀
         */
        // float f2 = 5.6;
        float f3 = (float) 5.6;
        float f4 = 5.6F;

        /**
         * 字符串 => 基本类型
         * 在通常情况下，字符串不能直接转换成基本类型，但显示通过基本类型对应的包装类则可以实现把字符串转换成基本类型
         */
        String str3 = "45";
        int iValue5 = Integer.parseInt(str3);
        System.out.println(iValue5);
    }

}
