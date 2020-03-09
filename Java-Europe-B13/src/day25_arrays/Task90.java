package day25_arrays;

public class Task90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag= false;
		
		String[] cars = {"honda","mercedes","qasqai","fiat","bmw"};
		
		for (int i=0; i< cars.length; i++) {
			
			if ("Honda".equalsIgnoreCase(cars[i])) {
				
				flag= true;
			
				break;
			}	
			else 
				
				flag = false;
			
		}
		
		if (flag) 
			
			System.out.println("I found your car Honda in this array!");
		else 
			System.out.println("I could not find your car Honda in this array");
	}

}
