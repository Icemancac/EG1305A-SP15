import java.util.Scanner;

public class PaperRockScissors {
	public static void main(String[] args) {
		int cpuGuess = (int) (Math.random() * 2) + 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Lets play a game of Rock, Paper, Scissors!");
		System.out
				.println("Input your guess. scissors (0), rock (1), paper (2):");
		int guess = input.nextInt();
		switch (guess) {
		case 0:
			switch (cpuGuess) {
			case 0:
				System.out.println("You Tie! Scissors ties Scissors");
				break;
			case 1:
				System.out.println("You Lost! Scissors loses to Rock");
				break;
			case 2:
				System.out.println("You Won! Scissors beats Paper");
				break;
			default:
				break;
			}
			break;
		case 1:
			switch (cpuGuess) {
			case 0:
				System.out.println("You Won! Rock beats Scissors");
				break;
			case 1:
				System.out.println("You Tie! Rock ties to Rock");
				break;
			case 2:
				System.out.println("You Lose! Rock loses to Paper");
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (cpuGuess) {
			case 0:
				System.out.println("You Lose! Paper loses to Scissors");
				break;
			case 1:
				System.out.println("You Won! Paper beats Rock");
				break;
			case 2:
				System.out.println("You Tie! Paper ties Paper");
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
}
