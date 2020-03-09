package Assignment2_challenge;

public class Assignment4 {

	public static void main(String[] args) {
		
		double bill = 200;
		
		int call= 110;
		
		
		if (call<=100) {
			
			bill = 200;}
		
		else if (call<=150 && call>100) {
		
			    bill = bill + (call-100)*0.60;}
			
		else   if (call<=200 && call<150) {
	            	
	            bill = bill + 30 + (call-150)*0.50;}
	            	
	    else if (call>200) {
	            	
	            bill = bill + 30 + 25 + (call-200)*0.40;}
	            		
		
		System.out.println("This month is bill ready and the amount is £ "+ bill );
	}

}
