package com.telefonos.marcas;

public class PhoneTest {
	public static void main(String[] args) {
		Galaxy S9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		iPhone X = new iPhone("X", 100, "AT&T", "Zing");
		
		S9.displayInfo();
		System.out.println(S9.ring());
		System.out.println(S9.unlock());
		
		X.displayInfo();
		System.out.println(X.ring());
		System.out.println(X.unlock());
	}
}
