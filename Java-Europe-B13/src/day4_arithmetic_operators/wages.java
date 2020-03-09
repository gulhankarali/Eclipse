package day4_arithmetic_operators;

public class wages {

	public static void main (String[] args) {
		
		double regularWage;
		
		float basePay = 25.75f;
		
		double regularHours = 40;
		
		double overTimeWage;
		
	    float overTimePay = 37.5f;
		
		double overTimeHours= 15;
		
		double totalWage;
		
		regularWage = basePay*regularHours;
		
		overTimeWage = overTimePay *overTimeHours;
		
		totalWage = regularWage+overTimeWage;
		
		System.out.println("Wages for this week are $ "+ totalWage);
		
		
		
		
	}
}
