package day19_string_manipulation;

import java.util.Scanner;

public class Task77 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write down the emoji: ");
		
		String str= scan.next();
		
		if (str.length()!=2) {
			
			System.out.println("Invalid emoji");
			
			return;
		}
		
		else if (str.charAt(0)==':') {
		
			switch (str.charAt(1)) {
			
			case ')' :
				
				System.out.println("smile");
				
				break;
				
			case '(' :
				
				System.out.println("upset ");
				
				break;
			case '/' :
	
				System.out.println("perplexed");
	
				break;
			case 'p' :
	
				System.out.println("playful");
	
				break;

			default: 
				

				System.out.println("Not a valid emoji");
				
				break;
			}       	
		}
		else if (str.charAt(0)==';') {
		
			switch (str.charAt(1)) {
			
			case ')' :
				
				System.out.println("wink");
				
				break;
				
			case '0' :
				
				System.out.println("surprised ");
				
		        break;

			default : 
				
				System.out.println("Not a valid emoji");
				
		        break;
			
			}   	
		}	
		else 
			
			System.out.println("Not a valid emoji");
	}

}
