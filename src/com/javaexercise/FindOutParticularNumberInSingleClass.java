package com.javaexercise;

public class FindOutParticularNumberInSingleClass {

	public static void main(String[] args) {
		dividingByThree();
		System.out.println("");
		dividingByFive();
	}
	public static void dividingByThree() {
		int a=3;
		for(int i=1;i<=100;i++) {
			if(i%a==0) {
				
				System.out.print(i+",");
			}
		}
	}
	public static void dividingByFive() {
		int b=5;
		for(int i=1;i<=100;i++) {
			if(i%b==0) {
				System.out.print(i+",");
			}
		}
	}

}
