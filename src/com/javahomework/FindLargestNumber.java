package com.javahomework;

public class FindLargestNumber {

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int f=2;
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
