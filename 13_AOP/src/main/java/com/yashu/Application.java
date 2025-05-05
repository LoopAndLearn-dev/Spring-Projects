package com.yashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct=SpringApplication.run(Application.class, args);
		MyApp ma=ct.getBean(MyApp.class);
		//ma.myLogic();
		//ma.journey();
		//ma.give();
		ma.exe();
		
	}

}
