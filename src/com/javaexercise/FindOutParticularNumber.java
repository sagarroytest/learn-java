package com.javaexercise;

public class FindOutParticularNumber {

	public static void main(String[] args) {
		int a=3;
		for(int i=1;i<=100;i++) {
			if(i%a==0) {
				System.out.println(i);
			}
		}

	}

}
