package Assignment3_challenge;

public class Assignment5 {

	public static void main(String[] args) {

		
		double  gramsFat= 555;
		
		double calories= 5000;
		
		double caloriesFat = 0;
		
		caloriesFat= gramsFat*9;
		
	
		if ((caloriesFat/calories)*100 <= 30.0 && (caloriesFat < calories)) {
			
		    
			System.out.println("Food is low in fat : Kcal " + caloriesFat);
			
		} else if ((caloriesFat/calories)*100 > 30.0 && (caloriesFat < calories)) 
			
			System.out.println("Food is high in fat : Kcal "+ caloriesFat);
			
		else
			
			System.out.println("Input is invalid! Kcal "+ caloriesFat);
			
		
	}

}
