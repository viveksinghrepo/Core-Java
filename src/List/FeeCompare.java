package List;

import java.util.Comparator;
  
public class FeeCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student e1=(Student)o1;
		Student e2=(Student)o2;
		
		return e1.getFee()-e2.getFee();
	}

}
