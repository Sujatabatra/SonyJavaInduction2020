package com.sujata.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	@Pointcut("execution(* com.sujata.component.Performer.perform(..))")
	public void performancePointcut() {
		
	}

//	@Before("performancePointcut()")
	public void switchOffPh() {
		System.out.println("All are requested to kindly switch off their phones!");
	}
	
//	@Before("performancePointcut()")
	public void takeSeats() {
		System.out.println("Audience are taking their seats!");
	}
	
//	@AfterReturning("performancePointcut()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
//	@AfterThrowing("performancePointcut()")
	public void demandRefund() {
		System.out.println("BOOO We need our money back!!!");
	}
//	@After("performancePointcut()")
	public void leaveAudi() {
		System.out.println("audience going home!");
	}
	@Around("performancePointcut()")
	public void instructionToAudience(ProceedingJoinPoint  joinpoint) {
		try {
			takeSeats();
			switchOffPh();
			//Before
			joinpoint.proceed();
			//After Returning
			applaud();
		}
		catch(Throwable ex) {
			//After throwing
			demandRefund();
		}
		finally {
			//After
			leaveAudi();
		}
	}
}
