package com.github.fight.DataTypeAndOperator;

// 表达式类型的自动提升
public class ExpressionTypeTransform {

    public static void main(String[] args) {
        /**
         * 当一个算术表达式中包含多个基本类型的值时，整个算术表达式的数据类型将发生自动提升。
         * 规则：
         *  所有的byte short char类型将被自动提升到int类型
         *  整个算术表达式的数据类型自动提升到与表达式中最高等级操作数同样的类型
         */
        // 定义一个short类型变量
        short sValue = 8;
        // 表达式中的sValue将自动提升到int类型，则右边的表达式类型为int
        // 将一个int类型值赋给short类型变量将发生错误
        // sValue = sValue - 2;

        // 表达式的类型将严格保持和表达式中最高等级操作数相同的类型
        // 两个int类型整数进行除法运算，即使无法除尽，也将会得到一个int类型结果
        int val = 3;
        int intResult = 23 / val;
        System.out.println(intResult); // 将输出7
    }

}
