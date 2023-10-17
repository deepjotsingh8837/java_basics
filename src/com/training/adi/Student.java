package com.training.adi;

public class Student {
	
	public Student() {
	
	}
	private String stuName;
	private int stuRoll;
	private int stuAge;
	public Student(String stuName,int stuRoll,int stuAge) {
		this.stuName=stuName;
		this.stuRoll=stuRoll;
		this.stuAge=stuAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stuName+" "+stuRoll+" "+stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuRoll() {
		return stuRoll;
	}

	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s2=new Student("Deepjot",12,10);
		s.setStuAge(12);
		s.setStuName("Deep");
		s.setStuRoll(15);
		System.out.println("Student Name= "+s.getStuName());
		System.out.println("Student Roll Number="+s.getStuRoll());
		System.out.println("Student age="+s.getStuAge());
		System.out.println(s2);
		

	}

}
