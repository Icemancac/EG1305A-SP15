//OK. O.Aktunc

import javax.swing.JOptionPane;

public class ComputeBMI {
	public static void main(String[] args) {
		String input = JOptionPane
				.showInputDialog("Enter your weight in pounds");
		double weight = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter your height in inches");
		double height = Double.parseDouble(input);
		final double LBTOKG = .45359237;
		final double INTOM = .0254;
		double bmi = (weight * LBTOKG) / (height * INTOM);
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bmi);
	}
}
