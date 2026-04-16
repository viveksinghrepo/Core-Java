package List;

public class Test1  {
 public static void main(String[] args) {
//	Test1 t=new Test1();
//	int a=t.m1();
//	System.out.println(a);
	 A a=(c,d)->c+d;
	int a1= a.m1(2,3);
	 System.out.println(a1);
}

// @Override
// public int m1() {
//	// TODO Auto-generated method stub
//	return 1;
// }
}


@FunctionalInterface
interface A{
	int m1(int a,int b);
	
}
