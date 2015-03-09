//OK. O.Aktunc

public class Circle {
	double radius;
	final double PI = 3.14159;
	double area;
	double circum;
	double diameter;

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		area = PI * radius * radius;
		return area;
	}

	public double getCircumference() {
		circum = PI * 2 * radius;
		return circum;
	}

	public double getDiameter() {
		diameter = radius * 2;
		return diameter;
	}
}
