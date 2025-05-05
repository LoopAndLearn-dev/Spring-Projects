package com.yash.Beans;

public class Cash implements Payment {
	public Cash() {
		System.out.println("Cash object created");
	}

	public void pay(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Bill of: " + amt + " paid through cash");
		
	}
}
