package com.inherit;


public class A {
	 public final int n =20; 
	 static String cname="Capgemini";
	
	
	
	public  void m1() {   
		
		cname="Accenture";
		System.out.println(cname);
	
	}
	
	
	
	public void mul() {
		System.out.println("mul method from A class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		System.out.println(cname);
		a.m1();
		

	}

}
