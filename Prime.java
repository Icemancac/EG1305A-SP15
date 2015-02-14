import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter a number. The System will find all the prime number smaller than this number.\n");
		int n = input.nextInt(); // the max number for test

		for (int i = 1; i < n; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					if (count % 10 == 0)
						System.out.print("\n");
					System.out.print(j + "\t ");
					count++;
				}
				if (i % j == 0) {
					j = i + 1;
				}
			}
		}
		System.out.print("\nThere are a total of " + count + " prime numbers");
	}
}