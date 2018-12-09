package com.github.fight.ObjectOrientedDown.Enum;

// 枚举类的成员
// 成员变量、方法和构造器

enum Gender1 {
    MALE, FEMALE;

    // 定义一个public修饰的实例变量
    public String name;
}

enum Gender2 {
    MALE, FEMALE;

    // 定义一个private修饰的实例变量
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误"); return;
                } case FEMALE:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误"); return;
                }
        }
    }
}

// 枚举类通常应该设计成不可变类，成员变量值不应该允许改变，这样更安全，而且代码更加简洁
// 如果将所有的成员变量都使用了final修饰符来修饰，所以要在构造器里为这些成员变量指定初始值(或在定义成员变量时指定默认值，或在初始化块中指定初始值，但这两种情况并不常见)，
// 因此应该为枚举类显示定义带参数的构造器
// 一旦为枚举类显式定义了带参数的构造器，列出枚举值时就必须对应地传入参数
enum Gender3 {

    /*
     * 在枚举类执行体首行列出枚举值时，实际上就是调用构造器创建枚举类对象，只是这里无须显式调用构造器
     * 前面列出枚举值时没有传入参数，甚至没有使用括号，仅仅是因为前面的枚举类包含无参数的构造器
     * */
    MALE("男"), FEMALE("女");

    // public static final Gender3 MALE = new Gender3("男");
    private final String name;

    private Gender3(String name) {

        this.name = name;
    }

    private Gender3(String name, int age) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }
}

public class Members {

    public static void main(String[] args) {
        // 通过Enum的valueOf()方法来获取指定枚举类的枚举值
        Gender1 g1 = Enum.valueOf(Gender1.class, "FEMALE");
        // 直接为枚举类的name实例变量赋值
        g1.name = "女";
        // 直接访问枚举值的name实例变量
        System.out.println(g1 + "代表: " + g1.name);

        // 通过EnumClass.valueOf()方法来获取指定枚举类的枚举值
        Gender2 g2 = Gender2.valueOf("FEMALE"); g2.setName("女"); System.out.println(g2 + "代表: " + g2.getName());
        g2.setName("男"); System.out.println(g2 + "代表: " + g2.getName());
    }

}
