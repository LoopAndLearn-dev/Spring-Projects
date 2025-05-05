package com.yash.Beans;

public class DebitCard implements Payment {
	public DebitCard() {
		System.out.println("Debit Card object created");
	}
	public void pay(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Bill of: " + amt + " paid through Debit Card");
		
	}
}
