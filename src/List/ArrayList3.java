package List;

//import java.util.ArrayList;
//import java.util.Collections;

public class ArrayList3{
	public static int thirdLargest(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num==first || num==second || num==third)
				continue;
			
			if(num>first) {
				third = second;
				second = first;
				first = num;
			} else if(num > second) {
				third = second;
				second = num;
			} else if(num > third) {
				third = num;
			}
		}
		
		if(third == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Array must have atleast 3 distinct elements.");
		}
		
		return third;
	}
	
	
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
		
//		Emp e1=new Emp(103, "Shiva");
//		Emp e2=new Emp(105, "Rudra");Emp e3=new Emp(100, "Neelkenth");
//		
//		ArrayList al=new ArrayList();
//		
//		al.add(e1);
//		al.add(e2);
//		al.add(e3);
//	System.out.println(al);
//		
////		e1.compareTo(e3);
//		Collections.sort(al);
//		System.out.println(al);
		
		int[] arr1 = {20,57,68,10,3};
		System.out.println(thirdLargest(arr1));
		
		int[] arr2 = {20,20,57,68,10};
		System.out.println(thirdLargest(arr2));
		
		int[] arr3 = {5,5,5,5,5};
		System.out.println(thirdLargest(arr3));
	}
}
