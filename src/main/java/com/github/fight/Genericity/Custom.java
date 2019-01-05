package com.github.fight.Genericity;

// 可以为任何类、接口增加泛型声明(并不是只有集合类才可以使用泛型声明，虽然集合类是泛型的重要使用场所)

// 定义Apple类时使用了泛型声明

/*
* 定义一个带泛型声明的Apple<T>类，使用Apple<T>类时就可为T传入实际类型，
* 这样就可以生成如Apple<String> Apple<Double>...形式的多个逻辑子类(物理上不存在)
* */
class Apple<T> {
    // 使用T类型形参定义实例变量
    private T info;

    public Apple() {}

    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
    
        System.out.println(info instanceof Object);
        return info;
    }

    public void setInfo(T info) {
    
        this.info = info;
    }

}
public class Custom {

    public static void main(String[] args) {
        // 由于传给T形参的是String，所以构造器参数只能是String
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());

        // 由于传给T形参的是Double，所以构造器参数只能是Double
        Apple a2 = new Apple(5.68);
        Apple<Double> a3 = new Apple<>(9.99);
        System.out.println(a2.getInfo());
        System.out.println(a3.getInfo());
        
        // 如果不传类型，系统会把T类型当成Object，对应的对象是 null
        // null 是 所有引用类型的实例
        Apple apple = new Apple();
        System.out.println(apple.getInfo());
    }
}
