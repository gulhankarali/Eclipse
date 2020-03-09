package Assignment2_challenge;



public class Assignment1 {

	public static void main(String[] args) {
		
		
		double massInPounds = 150; 
		double heightInInches = 5.4;
		
		int inches, feet;
		double temp;
		double BMI;
		double massInKilos, heightInMeters;
		String riskFactory=" ";
		
		feet= (int)heightInInches*10/10;
		
		temp = heightInInches*10%10;
		
		inches = (int)temp;
		
	    massInKilos = massInPounds/2.2;
	    
	    heightInMeters = inches*0.0254+ feet*0.3048;
	    
	    BMI = massInKilos/ (heightInMeters*heightInMeters);
	    
	    if (BMI<18.5) {
	    	
	    	riskFactory= "Underweight";
	   
	    } else if (BMI>18.5 && BMI<25) {
	    	
	     	riskFactory= "Normal weight";
	    
	    }else if (BMI>25 && BMI<30) {
	    	
	    	riskFactory= "Overweight";
	    	
	    } else if (BMI>30) {
	    	
	    	riskFactory= "Obese";
	    }	
	   
	    System.out.println("Your weight in pounds\t"+ massInPounds);
	    System.out.println("Your height in inches\t"+ feet + " "+ inches);
	    System.out.println("Your BMI\t\t"+ BMI);
	    System.out.println("Your risk factory\t"+ riskFactory);
	    
	}

}
