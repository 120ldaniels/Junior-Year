package lifeInsurance.geometry;

public abstract class Shape implements Comparable<Shape> {
	
	protected double area;
	protected double perimeter;
	protected int sides;

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	public int getSides(){
		return sides;
	}

	public int compareTo(Shape obj) {
		if ((area - obj.getArea()) == 0)
			return 0;
		else if ((area - obj.getArea()) > 0)
			return 1;
		else return -1;
	}
}
