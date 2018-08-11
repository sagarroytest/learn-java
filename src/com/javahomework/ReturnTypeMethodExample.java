package com.javahomework;

public class ReturnTypeMethodExample {

	public static void main(String[] args) {
		ReturnTypeMethodExample obj=new ReturnTypeMethodExample();
		int value=obj.sum();
		System.out.println(value);
		
		//System.out.println(obj.sum());

	}
	public int sum() {
		int a=20;
		int b=10;
		int c=a+b;
		return c;
	}

}
