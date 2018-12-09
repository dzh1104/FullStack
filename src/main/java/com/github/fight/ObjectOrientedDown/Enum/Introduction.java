package com.github.fight.ObjectOrientedDown.Enum;

// 枚举类

/*
 * enum定义枚举类
 * 和普通类的区别:
 *   1)枚举类可以实现一个或多个接口，使用enum定义的枚举默认继承了java.lang.Enum类，而不是默认继承Object类，因此枚举类不能显示继承其他父类
 *   2)使用enum定义、非抽象的枚举类默认会使用final修饰，因此枚举类不能派生子类
 *   3)枚举类的构造器只能使用private访问控制符，如果省略了构造器的访问控制符，则默认使用private修饰；如果强制指定访问控制符，则只能指定private修饰符
 *   4)枚举类的所有实例必须在枚举类的第一行显示列出，否则这个枚举类永远都不能产生实例。列出这些实例时，系统会自动添加public static final修饰，无须显示添加
 *   5)枚举类的实例只能是枚举值，而不是随意地通过new来创建枚举类对象
 * */

enum SeasonEnum {
    // 第一行列出，自动添加public static final
    SPRING, SUMMER, FALL, WINTER;
}

public class Introduction {

    public void judge(SeasonEnum s) {

        switch (s) {
            // 无须添加枚举类作为限定
            case SPRING:
                System.out.println("春天"); break;
            // case SeasonEnum.SUMMER:
            // 添加上枚举类还报错
            case SUMMER:
                System.out.println("夏天"); break; case FALL:
                System.out.println("秋天"); break; case WINTER:
                System.out.println("冬天"); break;
        }
    }

    public static void main(String[] args) {
        // 枚举类默认有一个values()方法，返回该枚举类的所有实例
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s);
        }
        // 使用枚举类实例时，可通过EnumClass.variable形式来访问
        new Introduction().judge(SeasonEnum.SPRING); int result = SeasonEnum.SPRING.compareTo(SeasonEnum.WINTER);
        System.out.println("春天在冬天前面吗？" + (result < 0)); System.out.println(SeasonEnum.SUMMER.name());
        System.out.println(SeasonEnum.SUMMER.toString()); int index = SeasonEnum.FALL.ordinal();
        System.out.println("秋天的顺序是" + (index + 1));
    }

}
