package com.javahomework;

public class NonStaticMethodStringExample {

	public static void main(String[] args) {
		NonStaticMethodStringExample anything = new NonStaticMethodStringExample();
		anything.stringEx();
		anything.stringEx("test123@gmail.com");
		anything.stringEx("test12@gmail.com", "2123456789034");
		anything.solution(30, "alok", 646987654);
		
		

	}
	public void stringEx() {
		String str="I am Sagor";
		System.out.println(str);
	}
	public void stringEx(String email) {
		System.out.println(email);
		
	}
	public void stringEx(String email, String phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
	}
	public void solution(int age,String name,int phoneNumber ) {
		
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(phoneNumber);
	
	}

}
