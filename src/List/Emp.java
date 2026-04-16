package List;

public class Emp  implements Comparable {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
//	 
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if(this.id>e.id)return 1;
		else if (this.id<e.id) return -1;
		return 0;
	}
	
}
