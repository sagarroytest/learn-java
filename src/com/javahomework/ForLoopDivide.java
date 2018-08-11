package com.javahomework;

public class ForLoopDivide {

	public static void main(String[] args) {
		int a = 3;
		int c = 5;
		for (int b=1; b<=100; b++) {
			if (b%a==0) {
				System.out.println(b);
			}
		}
   
		System.out.println("*******************");
   
		for (int b=1; b<=100; b++) {
		if (b%c==0) {
			System.out.println(b);
		}
	}
		System.out.println("*******************");
		
		for (int b=1; b<=100; b++) {
			if (b%a==0 && b%c==0) {
				System.out.println(b);
				
			}
		}
}
}