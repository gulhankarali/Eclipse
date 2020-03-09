package Assignment2_challenge;

public class Task45 {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=10; i++) {
			
			int number1=198, number2=198;
			
			if (number1 > number2) {
				System.out.println( "Largest number is "+ number1);
				
			}
			else if (number2 > number1) {		
				System.out.println( "Largest number is "+ number2);
			}
			else if (number1==number2) { 
			
				System.out.println("The numbers are equal");
			}
		}
	}
}
