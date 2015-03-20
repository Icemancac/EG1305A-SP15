import java.util.Random;

public class Coin {
	String sideUp;

	public Coin() {
		Random rand = new Random();
		int  n = rand.nextInt(2);
		if(n==0)
			sideUp = "Heads";
		else
			sideUp ="Tails";
	}
	public void toss(){
		Random rand = new Random();
		int  n = rand.nextInt(2);
		if(n==0)
			sideUp = "Heads";
		else
			sideUp ="Tails";
	}
	public String getSideUp() {
		return sideUp;
	}
	
}
