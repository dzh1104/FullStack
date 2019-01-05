package com.github.fight.Genericity;

// 设定类型形参的上限

class Banana<T extends Number> {
	T col;

public static void main(String[] args) {
	Banana<Integer> b1 = new Banana<>();
	Banana<Double> b2 = new Banana<>();
	// 下面代码将引发编译异常，下面代码试图把String类型传给T类型形参
	// 但String不是Number的子类型，所以引起编译错误
	// Banana<String> b3 = new Banana<>();
}
}

public class TypeParameterUpperLimit {
	
}
