
public class diameter {
	public static void main(String[] args) 
	{
		int radius = 5;
		double diameter = Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.printf("\nA circle of radius %d has an area of %.2f" ,radius, area );
		System.out.printf("\nThe circle's diameter is %.2f" , diameter);
	}
}