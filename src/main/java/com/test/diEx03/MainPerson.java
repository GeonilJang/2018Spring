package com.test.diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		String confLoc = "classpath:person.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		PersonInfo personinfo = ctx.getBean("personInfo", PersonInfo.class);
		personinfo.getPersonInfo();
		
		
		Person person = ctx.getBean("person2",Person.class);
		personinfo.setPerson(person);
		personinfo.getPersonInfo();
		
		
		
		
		
		
		
		
		
		
		ctx.close();
		
	}

}
