package com.sujata.crosscutting;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Audience {

	@Pointcut("execution(* com.sujata.component.Performer.perform(..))")
	public void myPointcut(){
		
	}
	public void takeSeats(){
		System.out.println("Audience are taking their seats");
	}
	
	public void switchOffPhs(){
		System.out.println("Audiences are switching off their Mobile Phones");
	}
	
	public void applaud(){
		System.out.println("CLAP CLAP CLAP!!");
	}
	
	public void demandRefund(){
		System.out.println("We need our money back!");
	}
	public void leaveAuditorium(){
		System.out.println("Audience leaving Auditorium!");
	}
	
	
//	@Around(value="execution(* com.sujata.component.Performer.perform(..))")
	@Around("myPointcut()")
	public void audienceBehaviour(ProceedingJoinPoint jp){
		try{
			takeSeats();
			switchOffPhs();
			jp.proceed();
			applaud();
		}
		catch(Throwable ex){
			demandRefund();
		}
		finally {
			leaveAuditorium();
		}
	}
}
