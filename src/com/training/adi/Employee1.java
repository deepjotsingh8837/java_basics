package com.training.adi;
import java.util.*;
public class Employee1 {
		String name;
		double salary;
		public Employee1(String name,double salary) {
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> emplist=new ArrayList<>();
		emplist.add(new Employee1("Deep",200000));
		emplist.add(new Employee1("Ajay",180000));

		emplist.add(new Employee1("Asim",120000));
		List<Employee1> employeeWithA=new ArrayList<>();
		for(Employee1 e:emplist) {
			if(e.getName().startsWith("A")) {
				employeeWithA.add(e);
			}
		}
		System.out.println("Employee Name Starts with A");
		for(Employee1 e:employeeWithA) {
			System.out.println("Name: "+e.getName()+", Salary: "+e.salary);
		}
	}

}
