package com.inherit;

public class B extends A {
	
	public void m1() {
		System.out.println("m1 overiiden method from B class");
		
	}
	
	public void m2() {
		System.out.println("m2 method from B class");
	}
	

	public static void main(String[] args) {
		
		

		
		
		B b =new B();
		b.m1();


		
		

	}

}
