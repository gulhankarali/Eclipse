package Assignment3_challenge;

public class Assignment7 {

	public static void main(String[] args) {
		
		char subsPackage ='C';
		
		int time = 45;
		
		double cost=0;
		
		switch (subsPackage) {
		
		case 'A':
			
			cost = 9.95+ (time-10)*2.0;
			
			System.out.println("Your package is A and your bill is : £" +cost);
			
			break;
			
		case 'B':
			
			cost = 13.95 + (time-20)*1.00;
			
			System.out.println("Your package is B and your bill is : £" +cost);
			
			break;
			
		case 'C':	
			
			cost = 19.95;
			
			System.out.println("Your package is C and your bill is : £" +cost);
			
			break;
			
		default:
			
			System.out.println("Invalid data");
			
			break;
			
		}
		

	}

}
