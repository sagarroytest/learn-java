package com.javahomework;

public class StaticMethodExample {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
		sum();
		sub();

	}
	public static void sum() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
	}
	public static void sub() {
		int a=9;
		int b=3;
		System.out.println(a-b);
	}

}
