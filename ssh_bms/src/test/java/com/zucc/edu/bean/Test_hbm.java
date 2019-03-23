package com.zucc.edu.bean;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class Test_hbm {

	@Test
	public void test() {
		//Customer customer = new Customer();
		//customer.setC_Id("aaaa");
		//Bank bank =  new Bank();
		//bank.setBank_Id("dasda");
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Bank bank = session.get(Bank.class,1);
		//System.out.println("======"+bank.getBank_Id());
		//session.save(customer);
		//session.save(BankCard);
		tx.commit();
		session.close();
		sessionFactory.close();
		System.out.println("====="+bank.getBank_Id());
		
	
		
		//assertEquals(expected, cu);
	}
	
	//@Test
/*	public void test() {
		
		Customer customer = new Customer();
		//BankCard BankCard = new BankCard();
		customer.setC_Id("xxxx");
		//BankCard.setBk_Id("aaaa");
		Set set = new HashSet<BankCard>();
		//set.add(BankCard);
		//customer.setBankCards(set);

		Configuration conf = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		//ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = conf.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		//session.save(BankCard);
		tx.commit();
		session.close();
		sessionFactory.close();
	}*/

}
