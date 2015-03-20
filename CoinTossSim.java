public class CoinTossSim {

	public static void main(String args[]) {
		int headsUp = 0;
		int tailsUp = 0;
		Coin coin1 = new Coin();
		System.out.printf(coin1.getSideUp() + " was intially facing up\n");// Initial
		for (int flips = 0; flips < 20; flips++) {
			coin1.toss();
			if (coin1.getSideUp() == "Heads")
				headsUp += 1;
			else
				tailsUp += 1;
			System.out.printf(coin1.getSideUp() + " was facing up\n");
		}
		System.out.printf("\nThe total number of times when the Head Side was facing up was %d\n",headsUp);
		System.out.printf("The total number of times when the Tail Side was facing up was %d\n",tailsUp);
	}

}
