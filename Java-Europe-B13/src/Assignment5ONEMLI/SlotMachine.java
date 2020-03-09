package Assignment5ONEMLI;

import java.util.*;

public class SlotMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Random rand= new Random();
		
		String[] array= {"Cherries","Orange","Plums","Bells","Melons","Bars"};
		
		double money=0.0;
		
		int rn1, rn2, rn3;
		
		String token1, token2, token3;
		
		String yesNo="N";
			
		do {
			System.out.print("How much money do you want to invest? :");
			
			money = scan.nextDouble();
			
			rn1 = rand.nextInt(5);
		
			token1= array[rn1];
			
			System.out.println(token1);
			
			rn2 = rand.nextInt(5);
			
			token2= array[rn2];
			
			System.out.println(token2);
			
			rn3 = rand.nextInt(5);
			
			token3= array[rn3];
			
			System.out.println(token3);
			
			if ((token1==token2)||(token1==token3)||(token2==token3)) {
				
				System.out.println("You won : £ "+money*2.0);
			} 
			
			else if ((token1==token2)&&(token1==token3)) {
				
				System.out.println("You won : £ "+money*3.0);
			   
			} else 
				
				System.out.println("You won : £ "+0.0);
			
			System.out.println("Would you like to play again? Y/N :");
			
			yesNo= scan.next();
			
			if ("N".equalsIgnoreCase(yesNo))
				
				break;
			
		} while (true);

	}

}
