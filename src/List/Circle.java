package List;

public class Circle <T extends Number> {

	T radii;

	public Circle(T radii) {
		super();
		this.radii = radii;
	}

	public T getRadii() {
		return radii;
	}

	public void setRadii(T radii) {
		this.radii = radii;
	}

	@Override
	public String toString() {
		return "Circle [radii=" + radii + "]";
	}
	
	
}
