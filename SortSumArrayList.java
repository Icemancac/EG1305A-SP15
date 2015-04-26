import java.util.ArrayList; // Needed for ArrayList class
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * This program demonstrates how to store BankAccount objects in an ArrayList.
 */

public class SortSumArrayList {
	public static void main(String[] args) {
		// Create an ArrayList to hold BankAccount objects.
		ArrayList<Integer> NumberList = new ArrayList<Integer>();

		NumberList.add(Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer :")));
		NumberList.add(Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer :")));
		NumberList.add(Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer :")));
		NumberList.add(Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer :")));
		NumberList.add(Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer :")));
		
		
		System.out.print("The Numbers entered were: ");
		// Display each item.
		for (int i = 0; i < NumberList.size(); i++) {
			System.out.print(NumberList.get(i) + " ");
		}
		Collections.sort(NumberList);
		System.out.print("\nThe Numbers Sorted are: ");
		// Display each item.
		for (int i = 0; i < NumberList.size(); i++) {
			System.out.print(NumberList.get(i) + " ");
		}System.out.println("\nHere is the sum of the numbers "+ sum(NumberList));	
	}
	public static int sum(ArrayList array){
		int sum=0;
		for (int i = 0; i < array.size(); i++) {
			sum += (int)array.get(i);
		}
		return sum;
	}
}