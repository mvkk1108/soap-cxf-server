package com.ems.models;

import java.io.Serializable;

public class Department  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private int deptno;
	private String deptname;
	private String location;
	public Department(int deptno, String deptname, String location) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.location = location;
	}
	public Department() {
		super();
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + ", location=" + location + "]";
	}
	
	

}
