package com.zucc.edu.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="bankcards")
public class BankCard {
	@Id
	@Column(name="bankCard_Id")
	private String bk_Id;
	@Column(name="bankCard_Num")
	private String bk_CardNum;
	@Column(name="bankCard_Password")
	private String bk_Password;
	@ManyToOne()
	@JoinColumn(name="customer_Id")
	private Customer customer;
	@Column(name="bankCard_Money")
	private String bk_money;
	
	@Column(name="prepareState1")
	private String prepareState1;
	@Column(name="prepareState2")
	private String prepareState2;
	
	public String getBk_Id() {
		return bk_Id;
	}
	public void setBk_Id(String bk_Id) {
		this.bk_Id = bk_Id;
	}
	public String getBk_CardNum() {
		return bk_CardNum;
	}
	public void setBk_CardNum(String bk_CardNum) {
		this.bk_CardNum = bk_CardNum;
	}
	public String getBk_Password() {
		return bk_Password;
	}
	public void setBk_Password(String bk_Password) {
		this.bk_Password = bk_Password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getBk_money() {
		return bk_money;
	}
	public void setBk_money(String bk_money) {
		this.bk_money = bk_money;
	}
	public String getPrepareState1() {
		return prepareState1;
	}
	public void setPrepareState1(String prepareState1) {
		this.prepareState1 = prepareState1;
	}
	public String getPrepareState2() {
		return prepareState2;
	}
	public void setPrepareState2(String prepareState2) {
		this.prepareState2 = prepareState2;
	}
	
	
	
	

}
