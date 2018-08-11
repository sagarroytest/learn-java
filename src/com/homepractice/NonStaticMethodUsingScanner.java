package com.homepractice;
import java.util.Scanner;

import com.javahomework.NonStaticMethodHomeWork;

public class NonStaticMethodUsingScanner {

	public static void main(String[] args) {
	
		NonStaticMethodHomeWork object = new NonStaticMethodHomeWork();
		object.takeAndPrintInfo("SAGAR", 42,"Freelancer");


	}
  Scanner input = new Scanner(System.in);
  
  public void takeAndPrintInfo(String name, int age, String jobtitle) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(jobtitle);
		
	
		
}
}