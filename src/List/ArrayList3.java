package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3{
	
	public static void main(String[] args) {
//		String s1="A";
//		String s2=s1;
//		String s3="C";
//		
//		ArrayList al=new ArrayList();
//		
//		al.add(s1);
//		s1="E";
//		al.add(s2);
//		s2="F";
//		al.add(s3);
//		System.out.println(al);
//		s1="D";
//		System.out.println(al);
//		System.out.println(s1);
		
		Emp e1=new Emp(103, "Shiva");
		Emp e2=new Emp(105, "Rudra");Emp e3=new Emp(100, "Neelkenth");
		
		ArrayList al=new ArrayList();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
	System.out.println(al);
		
//		e1.compareTo(e3);
		Collections.sort(al);
		System.out.println(al);
		
	}
}
