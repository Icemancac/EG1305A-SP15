
import javax.swing.JOptionPane;

public class Distinct {
	public static void main(String[] args){
		System.out.println("This program will find the distinct numbers among the 10 that you enter");
		int[] numList = new int[11];
		int num = 0;
		while(num<10){
			numList[num]=Integer.parseInt(JOptionPane
					.showInputDialog("Enter an Integer :"));
			num++;
		}
		//for(int k = 0;k<10;k++){
			//System.out.print(numList[k]+ " ");
		//}
		for(int i =0; i<10;i++){
			for(int j=i;j<10;j++){
				if(numList[i]==numList[j+1])
					j=10;
				if(j==9)
					System.out.print(numList[i] +" ");
			}
		}

	}
	
}
