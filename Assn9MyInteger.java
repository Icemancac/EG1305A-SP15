public class Assn9MyInteger {

	static int value;

	public Assn9MyInteger(int n) {
		Assn9MyInteger.value = n;
	}

	public int getValue() {
		return value;
	}

	public static int parseInt(String a) {
		return value = Integer.parseInt(a);
	}

	public boolean equals(int n) {
		if (n == value)
			return true;
		else
			return false;
	}

	public boolean equals(Assn9MyInteger a) {
		if (a.getValue() == value)
			return true;
		else
			return false;
	}

	public static boolean isEven(Assn9MyInteger a) {
		if (a.getValue() % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(Assn9MyInteger a) {
		if (a.getValue() % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(Assn9MyInteger a) {
		if (a.getValue() <= 1) {
			return false;
		}
		if ((a.getValue() == 2) || (a.getValue() == 1)) {
			return true;
		}
		if (a.getValue() % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(a.getValue()) + 1; i = i + 2) {
			if (a.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

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
		if ((n == 2) || (n == 1)) {
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

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 == 1)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		if (value <= 1) {
			return false;
		}
		if ((value == 2) || (value == 1)) {
			return true;
		}
		if (value % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(value) + 1; i = i + 2) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}