package com.github.fight.Genericity;

import java.util.ArrayList;
import java.util.List;

// 设定类型通配符的上限

// 定义一个抽象类Shape
abstract class Shape {
    public abstract void draw(Canvas c);
}

// 定义Shape的子类Circle
class Circle extends  Shape {
    // 实现画图方法
    public void draw(Canvas c) {

        System.out.println("在画布" + c + "上画一个圆");
    }
}

// 定义Shape的子类Rectangle
class Rectangle extends Shape {
    // 实现画图方法
    public void draw(Canvas c) {

        System.out.println("把一个矩形画在画布" + c + "上");
    }
}

class Canvas {
    /*
    public void drawAll(List<Shape> shapes) {
        for(Shape s : shapes) {
           s.draw(this);
        }
    }
    */

    public void drawAll(List<? extends Shape> shapes) {
        // 使用通配符后，就不能直接定义迭代变量类型为Shape了，需要强制类型转换
        /*
        for(Shape s : shapes) {
            s.draw(this);
        }
        */

        // 使用通配符来标识所有类型，方法可以接受List<Circle>对象作为参数，问题来了:
        // 臃肿繁琐，使用了泛型还需要进行强制类型转换
        // 实际上是需要一种泛型表示法，他可以表示所有Shape泛型List的父类
        /*
        for(Object obj : shapes) {
            Shape s = (Shape)obj;
            s.draw(this);
        }
        */

        for(Shape s : shapes) {
            s.draw(this);
        }
    }
}
public class TypeWildcardUpperLimit {

    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        Canvas c = new Canvas();
        // 不能把List<Circle>当成List<Shape>使用，编译错误
        // 所以继续使用类型通配符
        c.drawAll(circleList);
    }
}
