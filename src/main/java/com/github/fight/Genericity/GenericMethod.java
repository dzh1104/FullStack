package com.github.fight.Genericity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

// 泛型方法

/**
 * 定义类、接口时可以使用类型形参，在该类的方法定义和成员变量定义、接口的方法定义(不可是成员变量，因为接口的成员变量是静态成员)中
 * 中，这些类型形参可被当成普通类型来用。
 *
 * 在另外一些情况下，定义类、接口时没有使用类型形参，但定义方法时想自己定义类型形参，这也是可以的，
 * Java 5提供了对泛型方法的支持。
 * */

/*
* 下面定义了一个泛型方法，该泛型方法中定义了一个T类型形参，这个T类型形参就可以在该方法内当成普通类型使用
* */
@Setter
@Getter
public class GenericMethod {

    // 私有属性，使用了lombok后，不需要再去写setter/getter
    private String lombokTestStr;

    private boolean check;
    
    /**
     * 该方法的c形参的数据类型是Collection<Object>
     * */
    static void fromArrayToCollectionNoG(Object[] a, Collection<Object> c) {
        for(Object o: a) {
            c.add(o);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for(T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        // T代表 Object类型
        fromArrayToCollection(oa, co);
        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        // T代表 String类型
        fromArrayToCollection(sa, cs);
        // fromArrayToCollection(oa, cs);

        // 测试是否有setter/getter
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.setLombokTestStr("dzh test lombok");
        System.out.println(genericMethod.getLombokTestStr());
        System.out.println(genericMethod.isCheck());
    }
}
