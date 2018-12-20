package com.github.fight.Genericity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

// 泛型方法

/*
* 下面定义了一个泛型方法，该泛型方法中定义了一个T类型形参，这个T类型形参就可以在该方法内当成普通类型使用
*
* */
@Setter
@Getter
public class GenericMethod {

    // 私有属性，使用了lombok后，不需要再去写setter/getter
    private String lombokTestStr;

    private boolean check;

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
