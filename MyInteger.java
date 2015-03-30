public class MyInteger {

	public static boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int n) {
		if (n % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if ((n == 2)||(n==1)) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
