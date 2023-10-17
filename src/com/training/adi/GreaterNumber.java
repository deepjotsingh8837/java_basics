package com.training.adi;
import java.util.*;
import java.util.function.Predicate;
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1=i -> i==8;
		System.out.println(p1.test(20));
	}
}
