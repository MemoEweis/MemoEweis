package com.example.client;
import java.util.Date;
//import com.example.domain.*;
import com.example.domain.Employee;  // Good Practice

public class Applecation {

	public static void main(String[] args) {
       
		Employee emp = new Employee();
		emp.empid = 101; // Legal if the field is public, But not good in OO practice
		
		emp.setEmpid(101);
		emp.setName("John Smith");
		emp.setSsn("011-32-4567");
		emp.setSalary(12354.45);
		
		
		
	}

}
