package com.github.fight.ObjectOrientedDown;

abstract class Shape {
    {
        System.out.println("执行Shape的初始化...");
    }

    private String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public Shape() {}

    public Shape(String color) {

        System.out.println("执行Shape的构造器...");
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSide(a, b, c);
    }

    private void setSide(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("三角形两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calPerimeter() {
        return this.a + this.b + this.c;
    }

    public String getType() {
        return "三角形";
    }
}
public class Abstract {

    public static void main(String[] args) {

        Shape t = new Triangle("red", 3, 4, 5);
        System.out.println(t.calPerimeter());
        System.out.println(t.getType());
    }
}
