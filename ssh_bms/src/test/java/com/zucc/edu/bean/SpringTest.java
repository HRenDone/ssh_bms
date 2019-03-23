package com.zucc.edu.bean;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zucc.edu.dao.DemoTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@Transactional
public class SpringTest {
	@Autowired
	private Bank bank;
	@Autowired
	private Department dept;
	@Autowired
	private SessionFactory sessionfactory;
	@Autowired
	private DemoTest dt;
	
	@Rollback(false)
	@Test
	public void test() {
		dt.insertBean();
	/*	bank.setBank_Id(666);
		System.out.println(bank.getBank_Id());
		Session session = sessionfactory.openSession();
		//Transaction tx = session.beginTransaction();
		session.save(bank);*/
		//tx.commit();
		//System.out.println(bank.getBank_Id());
		//System.out.println(bank.getBank_Id());
		//session.save(bank);
		
		//session.get(, id)
		//session.get(, id)
		
		//System.out.println(bank.getBank_Id());
		//System.out.println(dept.getDept_Id());
		
	}

}
