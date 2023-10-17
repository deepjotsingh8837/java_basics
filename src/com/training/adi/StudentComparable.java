package com.training.adi;

public class StudentComparable implements Comparable<StudentComparable> {
	int rollNo,age;
	String name;
	StudentComparable(String name,int rollNo,int age){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
	}

	@Override
	public int compareTo(StudentComparable o) {
		// TODO Auto-generated method stub
		if(age==o.age) {
			return 0;
		}
		else if(age>o.age) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}
