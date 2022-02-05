package com.example.domain;

public class Manager extends Employee {
	
	
    private String deptName;
    public Manager(int empid,String name,String ssn,double salary,String dep ) { //Constructor
  	  super (empid,name,ssn,salary);
  	  this.deptName = dep;
  	  
  	  
  	  
}
	public String getDeptName() {
		// TODO Auto-generated method stub
		return null;
	}
	
    
 }
