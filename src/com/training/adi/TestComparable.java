package com.training.adi;
import java.util.*;
public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentComparable> st=new ArrayList<StudentComparable>();
		st.add(new StudentComparable("Deep",10,22));
		st.add(new StudentComparable("Ramu",11,23));
		st.add(new StudentComparable("Deepu",32,22));
		st.add(new StudentComparable("Kunu",5,12));
		Collections.sort(st);
		for(StudentComparable c:st) {
			System.out.println(c.name+" "+c.rollNo+" "+c.age);
		}

	}

}
