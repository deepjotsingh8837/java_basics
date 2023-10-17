package com.training.adi;
import java.util.*;
public class SavingsAccount {
	Scanner s=new Scanner(System.in);
	int amount;
	int rateOfInterest,time;
	void input() {
		System.out.print("Enter the amount: ");
		amount=s.nextInt();
		System.out.print("Enter the rate: ");
		rateOfInterest=s.nextInt();
		System.out.print("Enter the time: ");
		time=s.nextInt();
	}
}
