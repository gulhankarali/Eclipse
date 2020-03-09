package Lab4;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner sc =new Scanner(System.in);
		
		Random rn = new Random();
		
		number1 = rn.nextInt(100);
		
		number2 = rn.nextInt(100);
		
		System.out.println("What is the answer to the following problem :");
		
		System.out.print(number1+" + "+number2+" = ");
		
		userAnswer =sc.nextInt();
		
		sum= number1+number2;
		
		if (sum==userAnswer)
			
			System.out.println("Correct answer");
		
		else {
			
			System.out.println("Sorry, wrong answer");
		
			System.out.println("Correct answer is : "+sum);
		}
		
	}

}
