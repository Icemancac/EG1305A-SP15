//OK. Good job. O.Aktunc

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FindPI {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		float sum = 0;
		float top = 1;
		float bottom = 1;
		for (int i = 0; i < 999999999; i++) {
			bottom = (2 * i) + 1;
			if ((i == 0) || (i % 2 == 0))
				top = 1;
			else
				top = -1;
			sum = sum + (top / bottom);
		}
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("PI = " + 4 * sum + " after 999999999 iterations\n");
		System.out.print("Execution time is " + (end - start)
				+ " milli seconds OR "
				+ formatter.format((end - start) / 1000d) + " seconds");
	}
}
