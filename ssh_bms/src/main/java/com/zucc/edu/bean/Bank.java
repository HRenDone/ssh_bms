package com.zucc.edu.bean;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name="banks")
public class Bank {
	
	@Id
	@Column(name="b_Id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Value(value="60")
	private int bank_Id;
	@Column(name="b_Name")
	private String bank_Name;
	@Column(name="b_TelphoneNum")
	private String bank_Tel;
	@Column(name="b_Address")
	private String bank_Address;
	@OneToMany(mappedBy="bank")
	private Set<Department> depts;
	
	
	public int getBank_Id() {
		return bank_Id;
	}
	public void setBank_Id(int bank_Id) {
		this.bank_Id = bank_Id;
	}
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getBank_Tel() {
		return bank_Tel;
	}
	public void setBank_Tel(String bank_Tel) {
		this.bank_Tel = bank_Tel;
	}
	public String getBank_Address() {
		return bank_Address;
	}
	public void setBank_Address(String bank_Address) {
		this.bank_Address = bank_Address;
	}
	public Set<Department> getDepts() {
		return depts;
	}
	public void setDepts(Set<Department> depts) {
		this.depts = depts;
	}
	

	
	
	
	

}
