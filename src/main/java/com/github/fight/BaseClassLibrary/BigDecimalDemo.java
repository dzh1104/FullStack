package com.github.fight.BaseClassLibrary;

// BigDecimal

import java.math.BigDecimal;
import java.math.RoundingMode;

// 学习文章：https://www.cnblogs.com/LeoBoy/p/6056394.html
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.2 + 0.1);
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);

        // BigDecimal构造方法

        // 1.public BigDecimal(double val)    将double表示形式转换为BigDecimal *不建议使用
        // 2.public BigDecimal(int val)　　将int表示形式转换成BigDecimal
        // 3.public BigDecimal(String val)　　将String表示形式转换成BigDecimal

        // 为什么不建议采用第一种构造方法呢？
        // 通常建议优先使用String构造方法
        BigDecimal bigDecimal = new BigDecimal(2);
        BigDecimal bDouble = new BigDecimal(2.3);
        BigDecimal bString = new BigDecimal("2.3");
        System.out.println("bigDecimal=" + bigDecimal);
        System.out.println("bDouble=" + bDouble);
        System.out.println("bString=" + bString);

        // 当double必须用作BigDecimal的源时，请使用Double.toString(double)转成String，然后使用String构造方法，
        // 或使用BigDecimal的静态方法valueOf

        BigDecimal bDouble1 = BigDecimal.valueOf(2.3);
        BigDecimal bDouble2 = new BigDecimal(Double.toString(2.3));

        System.out.println("bDouble1=" + bDouble1);
        System.out.println("bDouble2=" + bDouble2);

        // BigDecimal加减乘除运算
        BigDecimal a = new BigDecimal("4.5");
        BigDecimal b = new BigDecimal("1.5");
        BigDecimal c = new BigDecimal("1.3");

        System.out.println("a + b =" + a.add(b));
        System.out.println("a - b =" + a.subtract(b));
        System.out.println("a * b =" + a.multiply(b));
        System.out.println("a / b =" + a.divide(b));
        // 异常：java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        // System.out.println("a / b =" + a.divide(c));

        /*
        这里有一点需要注意的是除法运算divide.

        BigDecimal除法可能出现不能整除的情况，比如 4.5/1.3，这时会报错java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

        其实divide方法有可以传三个参数

        public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
        第一参数表示除数， 第二个参数表示小数点后保留位数，
        第三个参数表示舍入模式，只有在作除法运算或四舍五入时才用到舍入模式
         */

        // 精确两位，四舍五入
        System.out.println("a / b =" + a.divide(c, 2, BigDecimal.ROUND_HALF_UP));

        // setScale方法：对BigDecimal进行截断和四舍五入
        BigDecimal a1 = new BigDecimal("4.5635");
        // 保留3位小数，且四舍五入
        a1 = a1.setScale(3, RoundingMode.HALF_UP);
        System.out.println(a1);

        // 加减乘除其实最终都返回的是一个新的BigDecimal对象，因为BigInteger与BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象
        BigDecimal a2 = new BigDecimal("4.5");
        BigDecimal b2 = new BigDecimal("1.5");
        BigDecimal res = a2.add(b2);

        System.out.println(res);
        //输出4.5. 加减乘除方法会返回一个新的BigDecimal对象，原来的a2不变
        System.out.println(a2);

        /*
        总结：
            (1)商业计算使用BigDecimal。

            (2)尽量使用参数类型为String的构造函数。

            (3) BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象，所以在做加减乘除运算时千万要保存操作后的值。

            (4)我们往往容易忽略JDK底层的一些实现细节，导致出现错误，需要多加注意。
         */

    }
}
