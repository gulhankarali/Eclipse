	package day18_scannerUtility;
	
	import java.util.*;
	
	public class changeMaker {
	
		public static void main(String[] args) {

			
			int count=1;
			
			Scanner money = new Scanner (System.in);
		
			
			do  {
		
				System.out.print("Write a number between 1-99 ");
				
				int input = money.nextInt();

				
				if (input <0 || input >99) {
				
					if (count==3) {
						
						System.out.println("You reached the max faulty number entrance");
						
						break;
					}
				    else {
						
						count++;
				
						System.out.println("Invalid data");
					}
				}	
				else 
				{	
					moneyChanger(input);
					
					break;
				}
            
			} while (true);
				
		}
		
		public static void moneyChanger(int input)	{
			
			
				int quarters= input/25;
		    
				int remainer = input%25;
		    
				int dimes = remainer/10;
		    
		    	int remainer1 = remainer%10;
			
		    	int nickels = remainer1/5;
		    
		    	int pennies = remainer1%5;
		   
		    	
		    	System.out.println(input + " Makes this " + quarters + " quarters " + dimes + " dimes " + 
		    			nickels + " nickels "+ pennies + " pennies ");
		
		}
	
	}
