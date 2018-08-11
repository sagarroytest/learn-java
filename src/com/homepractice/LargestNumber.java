package com.homepractice;

public class LargestNumber {

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int e=2;
		if(a>b & a>c & a>d & a>e) {
			System.out.println("the largest number is"+"="+ a);
		}
		if(b>c &b>d & b>e) {
			System.out.println("the largest number is"+"="+ b);
		}
		if(c>d & c>e){
			System.out.println("the largest is"+"="+ c);
		}
		else if(d>e) {
			System.out.println("the largest number is"+"="+ d);
		}
		else {
			System.out.println("the largest number is"+"="+ e);
		}

	}

}
