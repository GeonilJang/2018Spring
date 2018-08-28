package com.test.diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String []args) {
		
		MyGetSum my = new MyGetSum();
		my.setGetsum(new GetSum());
		my.setA(10);
		my.setB(20);
		my.sum();
		
		System.out.println("Hello world");
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum myGetSum = ctx.getBean("mygetsum",MyGetSum.class);
		myGetSum.sum();
		
		
		
		
		
		
		
		
	}
}
