package com.zucc.edu.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zucc.edu.bean.Bank;


@Component
public class DemoTest {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private Bank bank;
	
	//@Transactional(propagation=Propagation.REQUIRED)
	//@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void insertBean(){
		System.out.println("=============="+bank.getBank_Id());
		Session session = sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		session.save(bank);
		//Serializable result = session.save(bank);
		//tx.commit();
		System.out.println("=============="+bank.getBank_Id());
		//session.clear();
	}
	
	/*public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		//SessionFactory sessionFactory = applicationContext.
		Session session = sessionFactory.openSession();
		Bank bank = new Bank();
		bank.setBank_Id(15);
		Transaction tx=session.beginTransaction();
		session.save(bank);
		tx.commit();
		session.close();
		sessionFactory.close();
		}
		*/
		
		
		
	
	

}
