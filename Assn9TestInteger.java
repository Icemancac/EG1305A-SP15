import javax.swing.JOptionPane;


public class Assn9TestInteger {
	public static void main(String args[]) {

		int n = Integer.parseInt(JOptionPane
				.showInputDialog("Please Enter the Compare value"));
		Assn9MyInteger a = new Assn9MyInteger(n);
		System.out.println(a.getValue());
		String s = (JOptionPane
				.showInputDialog("Please enter a value to Compare"));
		
	
		System.out.print("\nCompare Number " + a.getValue());
		System.out.print("\nUser Input Number " + Assn9MyInteger.parseInt(s));
		
		System.out.print("\nIs the input number equal to the compare value " + a.equals(n));
		System.out.print("\nIs the compare number equal to the compare value " + a.equals(a.getValue()));
						
		System.out.print("\nIs the Input Number Even " + Assn9MyInteger.isEven(Assn9MyInteger.parseInt(s)));
		System.out.print("\nIs the Input Number Odd " + Assn9MyInteger.isOdd(Assn9MyInteger.parseInt(s)));
		System.out.print("\nIs the Input Number Prime " + Assn9MyInteger.isPrime(Assn9MyInteger.parseInt(s)));
		
		System.out.print("\nIs the Compare Number Even " + Assn9MyInteger.isEven(n));
		System.out.print("\nIs the Compare Number Odd " + Assn9MyInteger.isOdd(n));
		System.out.print("\nIs the Compare Number Prime " + Assn9MyInteger.isPrime(n));
						
		System.out.print("\nIs the Input Number Even " + a.isEven());
		System.out.print("\nIs the Input Number Odd " + a.isOdd());
		System.out.print("\nIs the Input Number Prime " + a.isPrime());
	}
}

//public Assn9MyInteger(int n)

//public int getValue() 
//public static int parseInt(String s) 

//public boolean equals(int n)
//public boolean equals(Assn9MyInteger a)

//public static boolean isEven(Assn9MyInteger a)
//public static boolean isOdd(Assn9MyInteger a)
//public static boolean isPrime(Assn9MyInteger a)

//public static boolean isEven(int n)
//public static boolean isOdd(int n)
//public static boolean isPrime(int n)

//public boolean isEven()
//public boolean isOdd()
//public boolean isPrime()
