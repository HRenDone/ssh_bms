package com.zucc.edu.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@Column(name="emp_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_Id;
	@Column(name="emp_FirstName")
	private String emp_FirstName;
	@Column(name="emp_LastName")
	private String emp_LastName;
	@Column(name="emp_Sex")
	private String emp_Sex;
	@Column(name="emp_Tel")
	private String emp_Tel;
	@Column(name="emp_Adderss")
	private String emp_Adderss;
	@Column(name="emp_Username")
	private String emp_Username;
	@Column(name="emp_Password")
	private String emp_Password;
	@Column(name="emp_Grade")
	private String emp_Grade;
	@ManyToOne()
	@JoinColumn(name="dept_Id")
	private Department dept;
	
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Grade() {
		return emp_Grade;
	}
	public void setEmp_Grade(String emp_Grade) {
		this.emp_Grade = emp_Grade;
	}
	public String getEmp_FirstName() {
		return emp_FirstName;
	}
	public void setEmp_FirstName(String emp_FirstName) {
		this.emp_FirstName = emp_FirstName;
	}
	public String getEmp_LastName() {
		return emp_LastName;
	}
	public void setEmp_LastName(String emp_LastName) {
		this.emp_LastName = emp_LastName;
	}
	public String getEmp_Sex() {
		return emp_Sex;
	}
	public void setEmp_Sex(String emp_Sex) {
		this.emp_Sex = emp_Sex;
	}
	public String getEmp_Tel() {
		return emp_Tel;
	}
	public void setEmp_Tel(String emp_Tel) {
		this.emp_Tel = emp_Tel;
	}
	public String getEmp_Adderss() {
		return emp_Adderss;
	}
	public void setEmp_Adderss(String emp_Adderss) {
		this.emp_Adderss = emp_Adderss;
	}
	public String getEmp_Username() {
		return emp_Username;
	}
	public void setEmp_Username(String emp_Username) {
		this.emp_Username = emp_Username;
	}
	public String getEmp_Password() {
		return emp_Password;
	}
	public void setEmp_Password(String emp_Password) {
		this.emp_Password = emp_Password;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	

}
