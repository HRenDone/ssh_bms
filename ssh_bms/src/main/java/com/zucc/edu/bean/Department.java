package com.zucc.edu.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
@Component
@Entity
@Table(name="departments")
public class Department {
	@Id
	@Column(name="dept_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dept_Id;
	@Column(name="dept_Name")
	private String dept_Name;
	@Column(name="dept_EmpNum")
	private String dept_EmpNum;
	@ManyToOne()
	@JoinColumn(name="bank_Id")
	private Bank bank;
	@OneToMany(mappedBy="dept")
	private Set<Employee> employees;
	
	
	public int getDept_Id() {
		return dept_Id;
	}
	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public String getDept_Name() {
		return dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	public String getDept_EmpNum() {
		return dept_EmpNum;
	}
	public void setDept_EmpNum(String dept_EmpNum) {
		this.dept_EmpNum = dept_EmpNum;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	
	
	
	
	

}
