package com.ems.models;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empno;
	private String empname;
	private String email;
	private String mobile;
	private Date dateofjoin;
	private double salary;
	
	
	
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Date getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(Date dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public Employee() {
		super();
	}
	public Employee(int empno, String empname, String email, String mobile, Date dateofjoin, double salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.email = email;
		this.mobile = mobile;
		this.dateofjoin = dateofjoin;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", email=" + email + ", mobile=" + mobile
				+ ", dateofjoin=" + dateofjoin + ", salary=" + salary + "]";
	}
	
	

}
