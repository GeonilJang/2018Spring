package com.test.diEx02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:examdao.xml");
		ExamDao examDao = ctx.getBean("examdao", ExamDao.class);
		examDao.outputMsg();
		
	}
}
