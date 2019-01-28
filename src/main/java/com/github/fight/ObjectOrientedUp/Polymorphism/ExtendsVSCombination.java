package com.github.fight.ObjectOrientedUp.Polymorphism;

class Base {

    public Base() {

        // this指向正在初始化的对象sub2，所以此时调用的是子类的test方法，而此时正在创建的对象的name实例变量是null，因此引发空指针异常
        this.test();
    }

    public void test() {

        System.out.println("将被子类重写的方法");
    }

}

class Sub2 extends Base {

    private String name;

    public void test() {

        System.out.println("子类重写父类的方法，其name长度" + this.name.length());
    }

}


public class ExtendsVSCombination {

    public static void main(String[] args) {

        /*
         * 当系统试图创建sub2对象，同样会先执行其父类构造器，如果父类构造器中调用了其子类重写的方法，则变成调用被子类重写后的方法
         * 此时正在创建的对象的name实例变量是null，因此引发空指针异常
         *
         * 类似: 方法多态性，访问的都是子类的方法
         */
        /*
        * 不要在父类构造器中，使用重写的方法
        * */
        Sub2 sub2 = new Sub2();

    }

}