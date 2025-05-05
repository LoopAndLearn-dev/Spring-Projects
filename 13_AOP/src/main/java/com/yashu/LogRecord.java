package com.yashu;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogRecord {
	
	FileWriter fw;
	@Before("execution(public void myLogic())")
	public void recordEntry() {
		try {
			fw=new FileWriter("C:\\Users\\Theju Shivappa\\Desktop\\Log\\LogRegister.txt");
			fw.write("Method Started"+ System.lineSeparator());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Method Started");
	}
	
	@After("execution(public void myLogic())")
	public void recordExit() {
		try {
			fw.write("Method Ended");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Method ended");
	}
	
	@Around("execution(public void journey())")
	public void securityCheck(ProceedingJoinPoint pjp) {
		
		System.out.println("Security check in India");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Imigration check");
	}
	
	@AfterReturning(pointcut = "execution(public String give())",returning = "y")
	void hold(String y) {
		System.out.println("Value: "+y);
	}
	
	@AfterThrowing(pointcut = "execution(public void exe())",throwing="e")
	public void getExe(Exception e) {
		System.out.println("Exception is recorded  "+e.getMessage());
	}
}
