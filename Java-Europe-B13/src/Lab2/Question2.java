package Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many biscuits have you eaten? :");
		
		int numberBiscuits= sc.nextInt();
		
		System.out.println("The calories that you have taken :" +CalculateCalories(numberBiscuits));
		

	}

	private static double CalculateCalories(int number) {

		return 75*number;
	}

}
