import javax.swing.JOptionPane;

public class TestInteger {
	public static void main(String args[]) {

		int number = Integer.parseInt(JOptionPane
				.showInputDialog("Please enter an integer"));

		System.out.print("Number Entered " + number);
		System.out.print("\nisEven " + MyInteger.isEven(number));
		System.out.print("\nisOdd " + MyInteger.isOdd(number));
		System.out.print("\nisPrime " + MyInteger.isPrime(number));
	}
}
