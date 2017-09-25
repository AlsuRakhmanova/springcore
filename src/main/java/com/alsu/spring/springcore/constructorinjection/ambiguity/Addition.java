package com.alsu.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(int a, double b) {
		System.out.println("Inside the constructor ");
		System.out.println(a);
		System.out.println(b);
	}
	
//	public Addition(double a, double b) {
//		System.out.println("Inside constructor Double");
//	}
//	public Addition(String a, String b) {
//		System.out.println("Inside constructor String");
//	}
	
	
}
