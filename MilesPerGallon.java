//OK. O.Aktunc

import javax.swing.JOptionPane;

public class MilesPerGallon {
	public static void main(String[] args) {
		String input = JOptionPane
				.showInputDialog("Enter the total miles driven");
		double miles = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter the number of gallons used");
		double gallons = Double.parseDouble(input);
		double mpg = (miles / gallons);
		JOptionPane.showMessageDialog(null, "Your Miles-per-Gallon is " + mpg);
	}
}
