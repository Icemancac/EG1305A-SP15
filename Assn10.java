import javax.swing.JOptionPane;

public class Assn10 {
	public static void main(String[] args){
		System.out.println("This program will find the highest, lowest, average and sum of the numbers that you enter");
		int listLength = Integer.parseInt(JOptionPane
				.showInputDialog("How many numbers do you want to enter?"));
		int[] numList = new int[listLength];
		int num = 0;
		while(num<listLength){
			numList[num] = Integer.parseInt(JOptionPane
					.showInputDialog("Enter Number " +(num+1)+":"));
			num++;
		}
		System.out.println("Highest element entered is " + getHighest(numList));
		System.out.println("Lowest element entered is " + getLowest(numList));
		System.out.println("The sum of the elements is " + getSum(numList));
		System.out.println("The average of the elements is " + getAverage(numList));
	}
	public static int getSum(int[] array){
		int sum = array[0];
		for(int i=1;i<array.length;i++){
			sum += array[i];
		}
		return sum;
	}
	
	public static double getAverage(int[] array){
		int sum = array[0];
		for(int i=1;i<array.length;i++){
			sum += array[i];
		}
		return sum/array.length;
	}
	public static int getHighest(int[] array){
		int max = array[0];
		for(int i=1;i<array.length;i++){
			if(max<array[i])
				max = array[i];
		}
		return max;
	}
	public static int getLowest(int[] array){
		int min = array[0];
		for(int i=1;i<array.length;i++){
			if(min>array[i])
				min = array[i];
		}
		return min;
	}
}
