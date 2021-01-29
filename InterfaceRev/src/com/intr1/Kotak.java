package com.intr1;

public class Kotak implements Rbi {

	public static void main(String[] args) {
		Kotak k =new Kotak();
		k.withdraw();
		k.deposit();

	}

	@Override
	public void withdraw() {
		System.out.println("KOTAK implements withdraw method of RBI");
		
	}

	@Override
	public void deposit() {
		System.out.println("KOTAK implements deposit method of RBI");
		
	}

}
