package com.javaexercise;

public class FindOutHighestNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b & a>c) {
			System.out.println("Largest number is "+a);
		}
		else if(b>c) {
			System.out.println("Largest number is "+b);
		}
		else {
			System.out.println("Largest number is "+c);
		}

	}

}
