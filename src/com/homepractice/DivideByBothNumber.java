package com.homepractice;

public class DivideByBothNumber {

	public static void main(String[] args) {
		int e=3;
		int g=5;
		for(int f=1; f<=100; f++) {
			if(f%e==0 && f%g==0) {
				System.out.println(f);
			}
		}

	}

}
