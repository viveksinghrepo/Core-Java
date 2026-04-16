package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList5 {
 public static void main(String[] args) {
	List l=new ArrayList();
//	l.add(new Student(1000,"Vivek",5000));
//	l.add(new Student(101,"Shiva",6000));
//	l.add(new Student(107,"Avi",4000));
//	
//	Collections.sort(l,new FeeCompare());
//	System.out.println(l);
	l.add(10);
	l.add(20);
	l.add(30);
	 ListIterator it=l.listIterator();
//	  it.hasNext();
//	  System.out.println(it.next());
//	  it.hasNext();
//	  System.out.println(it.next());
//	  it.hasPrevious();
//	  System.out.println(it.previous());
//	  it.hasNext();
//	  System.out.println(it.next());
	 
	 while(it.hasNext()) {
		 Integer i=(Integer) it.next();
		 if(i==20) {
			 it.set(21);
			 it.add(25);
		 }
	 }
	 System.out.println(l);
//	  
}
}
