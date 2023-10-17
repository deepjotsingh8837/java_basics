package com.training.adi;

import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer b=(x,y)->System.out.println(x+" "+y);
		b.accept(20, 40);
		b.accept("Deep", "Jot");

	}

}
