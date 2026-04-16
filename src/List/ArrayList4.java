package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayList4 {
 public static void main(String[] args) {
	
	 ArrayList al=new ArrayList();
//	 String s
//	 al.add(1);
//	 al.add(2);
//	 al.add(3);
//	 al.add(4);
//	 al.add(4);
//	 al.add(5);
//	 al.remove(Integer.valueOf(1));
//	 System.out.println(al);
//	 int count=0;
//	 for(Object s:al) {
//		 System.out.println(count);
//		 al.add(s);// ConcurrentModificationException
//		 System.out.println("in line :" + ++count);
//		 System.out.println(s);
//	 }
//	 Collections.sort(al);
	 System.out.println(al);
	 Emp e1=new Emp(105, "H");
	 Emp e2=new Emp(102, "B");
	 Emp e3=new Emp(103,"A");
	 
	 al.add(e1);al.add(e2);
	 al.add(e3);
	
	 Collections.sort(al);
	 System.out.println(al);
	 
	 
}
}

