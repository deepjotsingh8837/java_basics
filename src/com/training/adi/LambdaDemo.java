package com.training.adi;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface obj=(st1,st2)->st1.equals(st2);
		String st1="Deepjot";
		String st2="Deepjot";
		System.out.println(obj.compare(st1, st2));
		
	}

}
