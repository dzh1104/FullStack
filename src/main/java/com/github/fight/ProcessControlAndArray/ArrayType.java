package com.github.fight.ProcessControlAndArray;

public class ArrayType {

    public static void main(String[] args) {
        // 静态初始化
        Object[] books = {"java", "spring"};
        // 访问数组元素，索引值小于0或者大于等于数组的长度，编译过程不会出错，但运行时出现异常: java.lang.ArrayIndexOutOfBoundsException: N
        // System.out.println(books[2]);
        int len = books.length;
        // 使用循环输出books数组的每个数组元素的值
        for (int i = 0; i < len; i++) {
            System.out.println(books[i]);
        }

        /**
         * foreach循环
         * 1) 语法
         *      for (type tempVariableName : array | collection) {
         *
         *      }
         * 2) 说明
         *      tempVariableName 临时变量
         *      type是数组元素或者集合元素的类型，如下代码所示，定义时元素类型为Object，初始化时元素类型为String，这样是可以的。但是，在使用foreach
         *      循环时，临时变量的类型必须和定义时元素的类型一致，不能是定义时元素类型的子类
         */
        String[] books2 = {"java", "spring"};
        for (Object book : books) {
            // for (String book : books) {
            System.out.println("book: " + book);
        }

        for (String book : books2) {
            // for (String book : books) {
            System.out.println("book: " + book);
        }

        int[][] a;
        a = new int[4][];
        for (int i = 0, len2 = a.length; i < len2; i++) {
            System.out.println(a.length);
            System.out.println(a[i]);
        }
        a[0] = new int[2];
        a[0][1] = 6;
        for (int i = 0, len2 = a[0].length; i < len2; i++) {
            System.out.println(a[0][i]);
        }
    }

}
