package Lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mealCharge;
		
		System.out.print("Enter the mealcharge please? :");
		
		mealCharge= sc.nextDouble();
		
		double tax= mealCharge*(6.75/100.0);
		
		double tip = (mealCharge+ tax)*(20.0/100.0);
		
		System.out.println("Meal Charge is listed below ");
		
		System.out.println("============================");
		
		System.out.println("Meal :\t £ "+ mealCharge);
		
		System.out.println("Tax :\t £ "+ tax);
		
		System.out.println("Tip :\t £ "+ tip);
		
		System.out.println("Sum :\t £ "+(mealCharge+tax+tip));
	}

}
