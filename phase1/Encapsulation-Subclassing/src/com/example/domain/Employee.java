package com.example.domain;

public class Employee {
	//Step 1: Hide implementation details (Encapsulate the data)
      private int empid;
      private String name;
      private String ssn;
      private double salary;
      // Make classes as immutable as possible
      // Step 3 : remove the no-arg constructor and implement a constructor that set  the value of all fields
      public Employee(int empid,String name,String ssn,double salary ) { //Constructor
    	  this.empid = empid;
    	  this.name = name;
    	  this.ssn = ssn;
    	  this.salary = salary;
    	  
      }
    	//Step 2: Remove all of Setter method. Change Name  and raise salary make sense in context of an employee
    	  
    	  public void changeName (String newName) {
    	  if (newName != null ) {
    		  this.name = newName;
    		  
    	  }
      }
    	  public void raiseSalary (double increase) {
        	  
        		  this.salary += increase;
        		  
        		  }	  
	public int getEmpid() {
		return empid;
	}

	//public void setEmpid(int empid) {
		//this.empid = empid;
	

	public String getName() {
		return name;
	}

	//public void setName(String name) {
		//this.name = name;
	

	public String getSsn() {
		return ssn;
	}

	//public void setSsn(String ssn) {
		//this.ssn = ssn;
	

	public double getSalary() {
		return salary;
	}

	//public void setSalary(double salary) {
		//this.salary = salary;
	}
      
      

