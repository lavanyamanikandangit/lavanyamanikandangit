package BankingModule;

import java.util.Random;

public class RandomBankAcNoCreation {
	//auto generating account number
	public static void AccountNumber() {
	    Random rand = new Random();
	    String card = "AC";
	    for (int i = 0; i < 10; i++)
	    {
	        int n = rand.nextInt(10) + 0;
	        card += Integer.toString(n);
	        System.out.print(""+card.charAt(i));
	        
	    }
	    for (int i = 0; i < 16; i++)
	    {
	        if(i % 4 == 0)
	          System.out.print(" ");
	        System.out.print(card.charAt(i));
	    }
	  }
}
