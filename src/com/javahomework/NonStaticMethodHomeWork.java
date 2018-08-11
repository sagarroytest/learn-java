package com.javahomework;

public class NonStaticMethodHomeWork {

	public static void main(String[] args) {
		
		NonStaticMethodHomeWork object = new NonStaticMethodHomeWork();
		object.takeAndPrintInfo("SAGAR", 42,"Freelancer");

		

	}
	public void takeAndPrintInfo(String name, int age, String jobtitle) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(jobtitle);
		
	}

}
