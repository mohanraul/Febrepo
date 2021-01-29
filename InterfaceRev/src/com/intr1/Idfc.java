package com.intr1;

public class Idfc implements Rbi {

	public static void main(String[] args) {
		/*
		 * Idfc i =new Idfc(); i.withdraw(); i.deposit();
		 */
		
		/*
		 * Rbi r1=new Idfc(); r1.withdraw(); r1.deposit();
		 */
		
		Rbi r2;
		r2=new Idfc();
		r2.deposit();
		r2.withdraw();
		
		r2=new Kotak();
		r2.withdraw();
		r2.deposit();

	}

	@Override
	public void withdraw() {
		System.out.println("IDFC implements withdraw method of Interface");
		
	}

	@Override
	public void deposit() {
		System.out.println("IDFC implements deposit method of Interface");
		
	}

}
