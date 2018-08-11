package com.javaexercise;

public class FindOutHighestNumberWay2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=60;
		int d=40;
		int f=50;
		int largest=Math.max(a, Math.max(b, Math.max(c, Math.max(d, f))));
		if(largest==a) {
			System.out.println("Largest number is "+a);
		}
		else if(largest==b) {
			System.out.println("Largest number is "+b);
		}
		else if(largest==c) {
			System.out.println("Largest number is "+c);
		}
		else if(largest==d) {
			System.out.println("Largest number is "+d);
		}
		else {
			System.out.println("Largest number is "+f);
		}

	}

}
