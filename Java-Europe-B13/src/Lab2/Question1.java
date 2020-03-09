package Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int number1, number2, max=0, yesNo;
		
		
		do {
			
			System.out.print("Enter your first number :");
			number1= sc.nextInt();
			
			System.out.print("Enter your second number :");
			number2= sc.nextInt();
			
			if ((number1>number2)&&(number1>max)) 
			{
				max= number1;
			}
			else if (number2>max)
			{	
				max= number2;
			}
			System.out.print("Do you want to enter another number 0-No,  1- Yes :");
		    
			yesNo= sc.nextInt();
				
		} while (yesNo==1);
		
		System.out.println("The biggest number you entered is :" +max);
	}
}
