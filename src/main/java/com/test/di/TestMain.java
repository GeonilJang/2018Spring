package com.test.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain{

	public static void main(String[] args) {
		
		String confLocation = "classpath:test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLocation);
		TestDAO testDao = ctx.getBean("TestDAOImp", TestDAOImp.class);
		
		System.out.println("===============================");
		testDao.printMsg();
		System.out.println("===============================");
		

		
	}

}
