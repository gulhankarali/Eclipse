package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Task85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number1;
		int number2;
		int countMine=0;
		int countYours=0;

		
		Scanner sc =new Scanner(System.in);
		
		Random rn = new Random();
		
	
		for(int i=1; i<=10;i++) {
		
			System.out.println("Rolling the dice for me");
			
			number1= rn.nextInt(6)+1;
			
			System.out.println("My number is :"+number1);
			
			System.out.println("Rolling the dice for you");
	
			number2= rn.nextInt(6)+1;
			
			System.out.println("Your number is :"+number2);
			
			sc.nextLine();
			
			if (number1 > number2) {
				
				countMine++;
			}
			else if (number2>number1) 
			{	
				countYours++; 
			} 
		}	
			
		if (countMine > countYours)
			
			System.out.println("Computer is winner "+ countMine);
		
		else if (countYours>countMine)
			
			System.out.println("You are the winner "+ countYours);
			
		else 
			
			System.out.println("There is no winner ");
	}

}
