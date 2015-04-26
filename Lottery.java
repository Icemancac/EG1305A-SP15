
import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {

		int[] userList = new int[5];
		int[] lotteryList = new int[5];
		getLottoNumbers(lotteryList);
		System.out.println("Enter a Series of 5 numbers");
		for(int i = 0;i<5;i++){
			getUserNum(userList,i);
		}
		System.out.println("The lottery Numbers are:");
		printLottoNumbers(lotteryList);
		System.out.println("You Matched "+ compareNumbers(lotteryList, userList)+ " numbers");
		
	}

	public static void getUserNum(int[] lottoGuess, int guess) {
		lottoGuess[guess] = Integer.parseInt(JOptionPane
				.showInputDialog("Enter an Integer :"));
		System.out.println("Enter Number " + (guess+1)+" " +lottoGuess[guess]);
	}

	public static void getLottoNumbers(int[] lottoList) {
		int num = 0;
		while (num < 5) {
			lottoList[num] = (int) (Math.random() * 10);
			num++;
		}
	}
	public static void printLottoNumbers(int[] lottoList) {
		for (int k = 0; k < 5; k++) {
			System.out.print(lottoList[k] + " ");
		}
	}

	public static int compareNumbers(int[] lottoList, int[] lottoGuess) {
		int match = 0;
		for (int i = 0; i < 5; i++) {
			if (lottoList[i] == lottoGuess[i])
				match++;
		}
		return match;
	}
}
