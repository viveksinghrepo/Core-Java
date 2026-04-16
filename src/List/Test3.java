package List;

import java.util.ArrayList;

class Box <T> {
	T[] arr;
	int size=0;

	public Box() {
		super();
		
	}
	public void add(T t) {
		arr[size++]=t;
	}
	
	
}
public class Test3{
	public static void main(String[] args) {
//		Box b1=new Box(new Circle());
//		Box b2=new Box(new Square());
//		System.out.println(b1.type);
//		System.out.println(b2.type);
//		
//		ArrayList arr=new ArrayList();
//		arr.add(10);
//		arr.add("A");
		Box<Circle> cirBox=new Box<Circle>();
		cirBox.add(new Circle<Integer>(5));
		cirBox.add(new Circle<Double>(5.3));
//		cirBox.add(new Circle<Integer>(5.3));
		cirBox.add(new Circle<Number>(400.2));
		Box<Square> sqrBox=new Box<Square>();
		sqrBox.add(new Square(4));
		
		
	}
}
