package com.training.adi;

public class Employee {
	
	String empName;     ///Camel case
	int empId;
	String deptName;
	double salary;  
	public Employee(int empId,String empName,String deptName,double salary) {
		this.empId=empId;
		this.empName=empName;
		this.deptName=deptName;
		this.salary=salary;
	}
	public double calculateNetSalary() {
		return salary;
	}
}
