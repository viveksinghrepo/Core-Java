package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayyList {
public static void main(String[] args) {
	   ArrayList list = new ArrayList();
       list.add(10);
       list.add(20);
       list.add(1, 50);

       System.out.println(list); //10, 50, 20
       
       list.add("A");
       list.add("B");
       list.add("C");

       list.remove("B");

       System.out.println(list);//A, C
       
       list.add(10);
       list.add(20);
       list.add(30);

       list.remove(1);

       System.out.println(list); //10,30
       
       list.add(10);
       list.add(20);
       list.add(30);

       list.remove(Integer.valueOf(20));

       System.out.println(list); // 	10,30
       
       list.add(10);
       list.add(20);
       list.add(10);

       list.remove(Integer.valueOf(10));

       System.out.println(list); // 20,10
       
       ArrayList list1 = new ArrayList(5);

       System.out.println(list1.size()); //0
       
       list.add(10);
       list.add(20);
       list.add(30);

       for(Integer i : list) {
           if(i == 20) {
               list.remove(i);
           }
       }

       System.out.println(list); //ConcurrentModificationException
       
       list.add(10);
       list.add(20);
       list.add(30);

       Iterator<Integer> it = list.iterator();

       while(it.hasNext()) {
           if(it.next() == 20) {
               it.remove();
           }
       }

       System.out.println(list);// 10,30
       
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);

       List<Integer> sub = list.subList(1, 3);

       sub.remove(0);

       System.out.println(list);// 10,30,40
       
       list.add(1000);
       list.add(1000);

       System.out.println(list.get(0) == list.get(1)); // false
       
       list.add(1);
       list.add(2);
       list.add(3);

       for(int i = 0; i < list.size(); i++) {
           list.remove(i);
       }

       System.out.println(list); //2
       
       Integer a = 127;
       Integer b = 127;

       Integer x = 128;
       Integer y = 128;

       System.out.println(a == b); //true
       System.out.println(x == y); // false
}
}
