package com.zucc.edu.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Test1 {
	@Autowired
	private DemoTest demoTest;
	
/*	//@Transactional
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoTest dt = applicationContext.getBean(DemoTest.class);
		dt.insertBean();
	}*/
	
	@Test
	@Rollback(value=false)
	public void insertB() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoTest dt = applicationContext.getBean(DemoTest.class);
		dt.insertBean();
	}
	
	

}
