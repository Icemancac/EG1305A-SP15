//OK. O.Aktunc

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args){
		int num = (int) (Math.random()*100)+1;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
	    int guess = input.nextInt();
	    while(guess!=num){
	    	if(guess<num){
	    		System.out.print("Guess Higher!\n");count++;}
	    	else{
		    	System.out.print("Guess Lower!\n");count++;}
	    	 guess = input.nextInt();
	    }
		System.out.print("You guessed it right!");
		System.out.print("\nIt only took you "+ count + " guesses.");
	}
}
