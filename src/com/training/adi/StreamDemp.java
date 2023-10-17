package com.training.adi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Ram","Sid","Sanam","Shivam","Shivi");
		//Stream<String> nameStream=names.stream();
		names.stream().filter(x->x.startsWith("S")).sorted().map(n->n.concat(" AB")).forEach(t->System.out.println(t));
		
	}

}
