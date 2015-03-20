import javax.swing.JOptionPane;

public class TestFan {
	public static void main(String args[]) {
		String input = JOptionPane.showInputDialog("Enter The fan speed");
		int fanSpeed = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter The fan radius");
		double fanRadius = Double.parseDouble(input);
		String color = JOptionPane
				.showInputDialog("Enter the color of the fan");
		int fanOn = Integer.parseInt(JOptionPane
				.showInputDialog("Is the fan On?(1 = Yes, 0 = No)"));
		Fan Fan1 = new Fan(fanSpeed, fanOn, fanRadius, color);
		System.out.print(Fan1.toString());
	}
}