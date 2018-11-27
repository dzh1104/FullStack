package com.github.fight.DataTypeAndOperator;

public class PrimitiveType {

    public static void main(String[] args) {

        /**
         * 整型
         */

        /**
         * 1) 通常情况下，直接给出一个整数值默认是int类型。
         *
         * 2) 特殊情况:
         *      1.如果直接将一个较小的整数值(在byte char short类型的表数范围内)赋给一个byte或者short变量，系统会自动把这个整数值当成byte char short类型来处理
         *      2.如果使用一个巨大的整数值(超出了int类型的表数范围)时，Java不会自动把这个整数值当成long类型来处理。如果希望系统把一个整数值当成long类型来处理，应在这个整数值后增加L作为后缀
         */

        /**
         * 系统自动把56当成byte类型处理，把56当成byte类型，不是默认的int类型，因为此时表数范围在byte范围内，而且是赋值给byte类型变量
         */
        byte byteValue = 56;

        byte byteValue2 = (byte) 5689;

        // byte byteValue3 = 129; // Incompatible types Required: byte Found: int

        short shortValue = 78;

        /**
         * 系统不会把999999999999当成long类型处理，因为999999999999超出了int的表数范围，而且此时999999999999是int类型，所以引起错误
         */
        /*long longValue = 999999999999;*/

        /**
         * 在巨大的整数值后使用L后缀，强制使用long类型
         * 不能使用强制类型转换(long)99999999999，因为99999999999还是int类型，超出它的表数范围
         */
        long longValue = 99999999999L;
        // long longValue = (long)99999999999; // integer number too large
        long longValue3 = (long) 99999999999L; // (long)99999999999L 多此一举

        /**
         * 可以把一个较小的整数值(在int类型的表数范围以内)直接赋给一个long类型的变量，这个并不是因为Java会把这个较小的整数值当成long类型来处理
         * Java依然把这个整数值当成int类型来处理，只是因为int类型的值会自动转换到long类型
         *
         * 1) 给出一个整数值，一般情况下默认是int类型，只有当这个值在byte char short的表数范围内，并且赋值给byte char short类型的变量时，这个整数值的类型才是byte char short。
         *    若这个值得范围超出了byte char short类型的表数范围，此时赋值给byte char short类型的变量时，会引发错误(从int转换到byte可能会有损失)
         *    ，可见此时整数值的类型是int，需要强制类型转换为byte
         */
        long longValue2 = 123;

        // 强制类型转换
        byte byteValue4 = (byte) 129;

        /**
         * 字符型
         */

        /**
         * 由于计算机底层保存字符时，实际是保存该字符对应的编号，因此char类型的值也可直接作为整型值来使用，它相当于一个16位的无符号位整数，表数范围是0~65535
         * char类型的变量、值完全可以参与加、减、乘、除等数学运算，也可以比较大小，实际上都是用该字符对应的编码参与运算
         */

        /**
         * 将一个char类型表数范围内的int整数赋值给char类型，系统会自动把这个int整数当成char类型来处理
         */
        char charValue1 = 88;

        /**
         * 字符型值表示形式1: 直接指定单个字符作为字符值
         */
        char cChar = 'a';

        /**
         * 字符型值表示形式2: 使用转义字符来作为字符值
         */
        char enterChar = '\r';
        System.out.println(enterChar);

        /**
         * 字符型值表示形式3: 使用Unicode编码值来指定字符值
         */
        char ch = '\u9999';
        System.out.println(ch);

        // 定义一个'疯'字符值
        char zhong = '疯';

        // 直接将一个char变量当成int类型变量使用
        int zhongValue = zhong;

        System.out.println(zhongValue);

        /**
         * 浮点型
         */
        float f1 = 5.2345556f;
        double d1 = 5.2345556;
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);

        /**
         * Java的浮点数有两种表示形式
         * 1) 十进制数形式: 5.12 5.0 浮点数必须包含一个小数点，否则会被当成int类型处理
         * 2) 科学计数法形式: 5.12e2 5.12E2
         *
         * 注意: 只有浮点类型的数值才可以使用科学计数法形式表示。例如，51200是一个int类型的值，但512E2则是浮点类型的值
         *
         * 注意：Java语言的浮点类型默认是double类型，如果希望把一个浮点类型值当成float类型处理，应该在这个浮点类型值后紧跟F
         *
         * 解读: 512E2定义的数值，只能赋值给浮点类型的变量
         */
        // int i1 = 512E2; // Incompatible types 类型不匹配
        float f2 = 512E2F; // 这个还要加一个F，否则也会Incompatible types，因为Required: float，Found: double

        // 所有的 无穷大数值都是相等的
        System.out.println(Double.POSITIVE_INFINITY == Float.POSITIVE_INFINITY);

        // float positive_infinity = 5.12/0; // Incompatible types
        double positive_infinity = 5.12/0;
        System.out.println(positive_infinity);

        // int positive_infinity2 = 5/0; // java.lang.ArithmeticException: / by zero
        // System.out.println(positive_infinity2);

        /**
         * 布尔型
         */
        // 如果使用一个boolean类型的值和字符串进行连接运算，则boolean类型的值将会自动转换成字符串
        String str = true + "demo";
        System.out.println(str);
    }

}
