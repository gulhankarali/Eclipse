package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner sc =new Scanner(System.in);
		
		Random rn = new Random();
		
		String answer= "Y";
		
		number1 = rn.nextInt(6)+1;
		
		number2 = rn.nextInt(6)+1;
		
		do {
		
			System.out.println("Rolling the dice...");
			
			System.out.println("Their values are :"+ number1+" "+number2);
			
				
			System.out.println("Roll them again y=yes");
			
			answer=sc.nextLine();
				
		}
		while (answer.equalsIgnoreCase("y"));	
		
	}

}
