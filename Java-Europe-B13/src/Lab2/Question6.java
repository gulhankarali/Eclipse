package Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		double purchase;
		
		System.out.print("Enter the amount of the purchase please? :");
		
		purchase = sc.nextDouble();
		
		double taxState= purchase*(4/100.0);
		
		double taxCounty = purchase*(2/100.0);
		
		System.out.println("Pruchase price listed below ");
		
		System.out.println("============================");
		
		System.out.println("Amount of the purchase :\t £ "+ purchase);
		
		System.out.println("State tax :\t\t\t £ "+ taxState);
		
		System.out.println("County tax :\t\t\t £ "+ taxCounty);
		
		System.out.println("Sum of the purchase :\t\t £ "+(purchase+taxCounty+taxState));

	}

}
