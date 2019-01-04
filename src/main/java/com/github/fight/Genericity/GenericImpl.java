package com.github.fight.Genericity;

interface AppleInterface<T> {
	T getInfo();
}
public class GenericImpl implements AppleInterface<String> {

@Override
//  public Object getInfo() {
public String getInfo() {
	
	return "dzh";
}

public static void main(String[] args) {
	
	GenericImpl generic = new GenericImpl();
	System.out.println(generic.getInfo());;
}

}

class GenericImpl2 implements AppleInterface {

@Override
public String getInfo() {
	
	return null;
}

}