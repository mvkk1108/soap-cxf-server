package com.ems.models.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ems.models.Employee;

@WebService(targetNamespace = "http://service.models.ems.com/", portName = "EmployeeServicePort", serviceName = "EmployeeServiceService")
public class EmployeeService {

	// jdbc 
	@WebMethod(operationName = "getEmployee", action = "urn:GetEmployee")
	public Employee getEmployee(@WebParam(name = "arg0") int empno)
	{
		
		// Establish Connection
		
		
		
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	Employee emp = null;
	try
	{
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  // 4 wheeler driver  5 , bus
		   
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdu005", "root", "root");
		
	
	    ps = con.prepareStatement("select * from employee where empno=?");
	    ps.setInt(1, empno);
	    rs = ps.executeQuery();
	    
	    if(rs.next())
	    {
	    	emp = new Employee();
	    	emp.setEmpno(rs.getInt(1));
	    	emp.setEmpname(rs.getString(2));
	    	emp.setEmail(rs.getString(3));
	    	emp.setMobile(rs.getString(4));
	    	emp.setDateofjoin(rs.getDate(6));
	    	emp.setSalary(rs.getDouble(5));
	    	
	    	
	    	
	    }
	
	}catch (Exception e) {
		
		e.printStackTrace();
	}
		
		
		return emp;
	}
	
	
	

	
	
	
}
