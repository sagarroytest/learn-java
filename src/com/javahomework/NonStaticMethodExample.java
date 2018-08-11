package com.javahomework;

public class NonStaticMethodExample {

	public static void main(String[] args) {
		
		NonStaticMethodExample object=new NonStaticMethodExample();
		object.sum();
		object.sub();

	}
	public void sum() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}

}
