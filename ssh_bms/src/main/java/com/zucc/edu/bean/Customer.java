package com.zucc.edu.bean;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customer {
	
	@Id()
	@Column(name="customer_Id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String c_Id;
	@Column(name="customer_FirstName")
	private String c_FirstName;
	@Column(name="customer_LastName")
	private String c_LastName;
	@Column(name="customer_Sex")//male or female
	private String c_sex;
	@Column(name="customer_Tel")
	private String c_Tel;
	@Column(name="customer_Address")
	private String c_Address;
	@Column(name="customer_UserName")
	private String c_UserName;
	@Column(name="customer_Password")
	private String c_Password;
	
	@OneToMany(mappedBy="customer")
	private Set<BankCard> bankCards;
	
	@Column(name="prepareState1")
	private String prepareState1;
	@Column(name="prepareState2")
	private String prepareState2;
	
	
	public String getC_Id() {
		return c_Id;
	}
	public void setC_Id(String c_Id) {
		this.c_Id = c_Id;
	}
	public String getC_FirstName() {
		return c_FirstName;
	}
	public void setC_FirstName(String c_FirstName) {
		this.c_FirstName = c_FirstName;
	}
	public String getC_sex() {
		return c_sex;
	}
	public void setC_sex(String c_sex) {
		this.c_sex = c_sex;
	}
	public String getC_Tel() {
		return c_Tel;
	}
	public void setC_Tel(String c_Tel) {
		this.c_Tel = c_Tel;
	}
	public String getC_Address() {
		return c_Address;
	}
	public void setC_Address(String c_Address) {
		this.c_Address = c_Address;
	}
	public String getC_LastName() {
		return c_LastName;
	}
	public void setC_LastName(String c_LastName) {
		this.c_LastName = c_LastName;
	}
	public String getC_UserName() {
		return c_UserName;
	}
	public void setC_UserName(String c_UserName) {
		this.c_UserName = c_UserName;
	}
	public String getC_Password() {
		return c_Password;
	}
	public void setC_Password(String c_Password) {
		this.c_Password = c_Password;
	}

	public Set<BankCard> getBankCards() {
		return bankCards;
	}
	public void setBankCards(Set<BankCard> bankCards) {
		this.bankCards = bankCards;
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
