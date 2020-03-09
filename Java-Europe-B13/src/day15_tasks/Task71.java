package day15_tasks;

public class Task71 {

	public static void main(String[] args) {
		

		double centimeters = calcFeetAndInchesToCentimeters(90);
		
		calcFeetAndInchesToCentimeters(6, 5);
		
		if (centimeters==-1)
	
			System.out.println("Invalid values");
		
		
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if ((feet <=0)||((inches<0)||(inches)>12)) {
			
			return -1;
			
			
		} 
			
       double  number = (feet*12+inches)*2.54;
			
	   System.out.println( feet + " feet + "+ inches + " inches = " + number + " Centimeters");
			
	   return number;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches<0) 
			
			return -1;
	
			
	    double feet = (int)inches/12;
		
		double remainingInches= inches%12;
		
	    System.out.println(inches+" inches "+ feet +" feet and " + remainingInches+ " inches ");
	    
	    return calcFeetAndInchesToCentimeters(feet, remainingInches);
	    
	}
}
