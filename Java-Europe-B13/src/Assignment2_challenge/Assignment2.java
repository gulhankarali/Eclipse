package Assignment2_challenge;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		double tax=0;
		double income= 700_000_000;
		double firstPart= 150_000_000*0.25;
		double secondPart= 150_000_000*0.30;
		double thirdPart = 300_000_000*0.35;
		double fourthPart = 600_000_000*0.40;		
				
		
		
		if (income<=150_000_000) {
			tax = income*0.25;
		}
		else if (income <= 300_000_000 && income > 150_000_000) {
			tax = firstPart + (300_000_000-income)*0.30;
		}
		else if (income <= 600_000_000 && income > 300_000_000) {
			tax = firstPart + secondPart + (600_000_000-income)*0.35;
		}
		else if (income<= 1_200_000_000 && income >600_000_000) {
			tax = firstPart + secondPart + thirdPart +(1_200_000_000-income)*0.40;
		}
		else if (income > 1_200_000_000) {
			tax = firstPart + secondPart + thirdPart + fourthPart +(1_200_000_000-income)*0.50;
		}
		
		System.out.println("Your calculated tax is : £ "+ Math.round(tax));
	}	

}
