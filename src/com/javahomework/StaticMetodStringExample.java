package com.javahomework;

public class StaticMetodStringExample {

	public static void main(String[] args) {
		stringEx();
		stringEx(25);
		stringEx(28, "Dhruba");
		solution();

	}
	public static void stringEx() {
		String str="I am Sagor";
		System.out.println(str);
		//System.out.println("str");"123" 123
	}
	public static void stringEx(int age) {
		
		System.out.println(age);
	}
	public static void stringEx(int age, String name) {
		System.out.println("My name is "+name+ "\n"+ "My age is "+age);
	}
	public static void solution() {
		int age=30;
		String name="Alok";
		int phoneNumber=646987654;
		String dob = "08/02/2010";
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(phoneNumber);
	    System.out.println(dob);
	}

}
