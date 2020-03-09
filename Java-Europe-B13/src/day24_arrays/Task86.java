package day24_arrays;

import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] months= new String[12];
		
		months[0]= "January";
		months[1]= "February";
		months[2]= "March";
		months[3]= "April";
		months[4]= "May";
		months[5]= "June";
		months[6]= "July";
		months[7]= "August";
		months[8]= "September";
		months[9]= "October";
		months[1]= "November";
		months[11]= "December";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month: ");
		
		int month= scan.nextInt();
		
		
		System.out.println("The month name is "+ months[month-1]);
	}

}
