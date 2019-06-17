package lifeInsurance.geometry;

public class Triangle extends Shape {

	double s1, s2, s3;

	public Triangle()
	{
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		sides = 3;

		s1 = side1;
		s2 = side2;
		s3 = side3;
		
		if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1)
			throw new IllegalArgumentException();

		perimeter = (side1 + side2 + side3);
		double p = perimeter / (2.0);
		area = (Math.sqrt((p * (p - side1) * (p - side2) * (p - side3))));
	}

	public int getType() {
		double a1 = (Math.toDegrees(Math.acos(((s2 * s2) + (s3 * s3) - (s1 * s1)) / (2 * s2 * s3))));
		double a2 = (Math.toDegrees(Math.acos(((s1 * s1) + (s3 * s3) - (s2 * s2)) / (2 * s1 * s3))));
		double a3 = (Math.toDegrees(Math.acos(((s2 * s2) + (s1 * s1) - (s3 * s3)) / (2 * s2 * s1))));

		if (a1 == 90 || a2 == 90 || a3 == 90)
			return 0;

		if (a1 > 90 || a2 > 90 || a3 > 90)
			return 1;

		return -1;
	}
}