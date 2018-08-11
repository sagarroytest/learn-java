package com.javahomework;

public class FindLowestNumber {

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int f=2;
		int lowest=Math.min(a, Math.min(b, Math.min(c, Math.min(d, f))));
		if(lowest==a) {
			System.out.println("Lowest number is "+a);
		}
		else if(lowest==b) {
			System.out.println("Lowest number is "+b);
		}
		else if(lowest==c) {
			System.out.println("Lowest number is "+c);
		}
		else if(lowest==d) {
			System.out.println("Lowest number is "+d);
		}
		else {
			System.out.println("Lowest number is "+f);
		}


	}

}
