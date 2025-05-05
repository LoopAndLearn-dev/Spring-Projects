package com.yash.Beans;

public class Shopping {
	private Payment p;
	
	public Shopping() {
		// TODO Auto-generated constructor stub
		System.out.println("Shopping object created");
	}
	public Shopping(Payment p) {
		System.out.println("Construcor Injection....");
		this.p=p;
	}
	public void setp(Payment p) {
		System.out.println("Setter Injection .....");
		this.p = p;
	}
	void doPayment(int amt) {
		if(p!=null) {
			p.pay(amt);
		}else {
			System.out.println("No payment mode selected");
		}
	}

}
