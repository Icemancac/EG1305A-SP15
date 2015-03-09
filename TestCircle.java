//OK. O.Aktunc

import java.util.Scanner;

public class TestCircle {
	public static void main(String args[]) {
		Circle circle1 = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius\n");
		double radius = input.nextDouble();
		circle1.radius = radius;
		System.out.println("Radius =\t" + circle1.getRadius());
		System.out.println("Diameter =\t" + circle1.getDiameter());
		System.out.println("Area =\t\t" + circle1.getArea());
		System.out.println("Circumference =\t" + circle1.getCircumference());
	}
}
