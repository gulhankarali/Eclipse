package day25_arrays;

import java.util.*;

public class TaskJoker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int hours;
		
		double wageHourly; 
		
		int [] employee= new int[5];
		
		for (int i= 0; i<5; i++) {
		
			System.out.print("Please enter the " + (i+1)+". employee's worked hour :");
		
			employee[i] = scan.nextInt();
			
		
		}
		
		System.out.print("What is the hourly rate for the employees? ");
		
		wageHourly= scan.nextDouble();
		
		for (int i= 0; i<5; i++) {
			
			System.out.print("Wage of the " + (i+1)+". employee: £ ");
		
			System.out.println(employee[i]*wageHourly);
		}	

	}

}
