package com.training.adi;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number of Elements: ");
		n=s.nextInt();
		int[] marks;
		marks=new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=s.nextInt();	
		}
		Arrays.sort(marks);
		System.out.println("Elements are: ");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		

	}

}
