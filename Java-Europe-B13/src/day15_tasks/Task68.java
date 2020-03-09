package day15_tasks;

import java.util.Calendar;

public class Task68 {

	public static void main(String[] args) {
		
		yearsUntilRetirment("Gulhan", "F", 1958);
		
	}

	public static void yearsUntilRetirment(String string, String gender, int i) {
		
		int retirementAge = calculateAge(i);
	
		
		switch (gender) {
		
		case "F":
		    retirementAge = 60-retirementAge; 
			break;
		case "M":
			retirementAge = 65-retirementAge;
			break;
		default:
			break;
		}	
	
		if (retirementAge<=0)
			
			System.out.println(string+ " is already retired.");
		else 
		    System.out.println(string+" retires in "+ retirementAge+" years time.");
		
	}

	public static int calculateAge(int i) {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);

        return year-i;		
	}

}
