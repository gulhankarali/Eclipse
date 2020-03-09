package Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum=0;

		System.out.print("Enter a number :");
		
		int number = sc.nextInt();
		
		if (number<=0)
			
			System.out.println("Invalid data!");
		
		for (int i =1 ; i<=number; i++) {
			
			sum= sum+i;
		}
	
		System.out.println("Sum of the numbers till "+ number+ " is :" +sum);
	}
	

}
