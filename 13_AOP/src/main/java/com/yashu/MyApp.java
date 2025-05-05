package com.yashu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
	
	public void myLogic() {
		System.out.println("This is Business Logic......");
	}
	
	public void journey() {
		System.out.println("International Trip...");
	}
	
	public String give() {
		return "Yashaswini Shivappa";
	}
	
	public void exe() {
		throw new RuntimeException("My own Exception");
	}
	
	

}
