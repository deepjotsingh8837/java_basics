package com.training.adi;

public class Myexceptions  extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		try {
			int y=5/x;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.print("Cant be divide by zero");

	}

  } 
}