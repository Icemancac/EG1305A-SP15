import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first Integer\t\t");
		int numone = input.nextInt();
		int max = numone;
		int min = numone;
		System.out.print("Enter the second Integer\t");
		int numtwo = input.nextInt();
		if (numtwo > max)
			max = numtwo;
		if (numtwo < min)
			min = numtwo;
		System.out.print("Enter the third Integer\t\t");
		int numthree = input.nextInt();
		if (numtwo > max)
			max = numtwo;
		if (numtwo < min)
			min = numtwo;
		System.out.printf("\nFor the numbers %d, %d and %d", numone, numtwo,
				numthree);

		System.out.printf("\nThe largest number is %d", max);
		System.out.printf("\nThe smallest number is %d", min);
		System.out.printf("\nThe sum of the numbers is %d",
				(numone + numtwo + numthree));
		System.out.printf("\nThe product of the numbers is %d", (numone
				* numtwo * numthree));
		System.out.printf("\nThe average of the numbers is %d", ((numone
				+ numtwo + numthree) / 3));

	}
}
