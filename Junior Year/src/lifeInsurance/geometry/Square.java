package lifeInsurance.geometry;

public class Square extends Quadrilateral {
	
	public Square()
	{
		
	}

	public Square(double side) {
		perimeter = (side * 4);
		area = (side * side);
	}
}