package com.training.adi;

public class PermanentEmployee extends Employee{
	double pfPercentage;
	double pfAmount;
	double netSalary;
	public PermanentEmployee(int empId,String empName,String deptName,double salary,double pfPercentage) {
		super(empId,empName,deptName,salary);
		this.pfPercentage=pfPercentage;
		pfAmount=(pfPercentage/100)*salary;
	}
	@Override
	public double calculateNetSalary() {
		netSalary=salary-pfAmount;
		return netSalary;
	}
	public void display() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Name = "+empName);
		System.out.println("Department Name: "+deptName);
		System.out.println("Salary: "+salary);
		System.out.println("PF Percentage: "+pfPercentage);
		System.out.println("PF Amount: "+pfAmount);
		System.out.println("Net Salary after PF deduction: "+netSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee e=new PermanentEmployee(101,"Deepjot","IT",20000,10);
		e.calculateNetSalary();
		e.display();
	}

}
