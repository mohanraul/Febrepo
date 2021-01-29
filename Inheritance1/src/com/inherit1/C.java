package com.inherit1;

import com.inherit.A;
import com.inherit.B;

public class C extends A{
	
	public void m1() {
		System.out.println("M1 method overiiden in C class");
	}
	
	public void m3() {
		System.out.println("M3 method from C class");
	}
	

	public static void main(String[] args) {
		
	
		B b =new B();
		b.m1();
		
		
	
		
		C c =new C();
		c.m1();

		
	}

}
