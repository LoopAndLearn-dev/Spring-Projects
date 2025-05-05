package com.yash.Beans;

public class CreditCard implements Payment{
	public CreditCard() {
		System.out.println("Credit Card object created");
	}
	public void pay(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Bill of: " + amt + " paid through Credit Card");
		
	}
}
