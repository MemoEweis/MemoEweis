package com.example.client;
//import com.example.domain.*;
import com.example.domain.Employee;  // Good Practice
import com.example.domain.Manager;

public class Applecation {

	public static void main(String[] args) {
       
		Manager mgr= new Manager (1,"Barbara Johns","011-22-34565",1000,"Marketing");
		
		mgr.raiseSalary(12000);
				String dept = mgr.getDeptName();
				
				
		//Employee emp = new Employee(1,"John Smith","011-22-3456",500.44);
		//emp.changeName("John Abraham");
		//emp.raiseSalary(1000.55);
		//emp.empid = 101; // Legal if the field is public, But not good in OO practice
		                 // illegal if the field is private, But it's good in OO practice
		//emp.setEmpid(101);
		//emp.setName("John Smith");
		//emp.setSsn("011-32-4567");
		//emp.setSalary(12354.45);
		
		
		
	}

}
