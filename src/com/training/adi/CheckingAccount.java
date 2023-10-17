package com.training.adi;

public class CheckingAccount extends SavingsAccount implements Account {
	///int rateOfInterest=5,time=10;
	double simpleInterest;
	
	
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		 simpleInterest=(amount*rateOfInterest*time)/100;
		 System.out.println("Simple Interest: "+simpleInterest);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount a=new CheckingAccount();
		a.input();
		a.calculateInterest();
	}



}
