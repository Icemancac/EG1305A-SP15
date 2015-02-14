import java.util.Scanner;

public class Mersenne {
	public static void main(String[] args) {
		long count = 0;
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter a number. The System will find all the Mersenne prime numbers smaller than this number.\n");
		long n = input.nextLong(); // the max number for test

		for (long i = 1; i < n; i++) {
			for (long j = 2; j <= i; j++) {
				if (i == j) {
					if (count % 10 == 0 && count > 0) {
						System.out.print("\n");
						count++;
					}
					for (double k = 2; ((long) Math.pow(2.0, k) - 1) <= j; k++) {
						long mersenne = ((long) Math.pow(2.0, k) - 1);
						if (mersenne == j) {
							System.out.print(j + "\t");
							count++;
						}
					}
				}
				if (i % j == 0) {
					j = i + 1;
				}
			}
		}
		System.out.print("\nThere are a total of " + count
				+ " Mersenne prime numbers\n");
	}
}