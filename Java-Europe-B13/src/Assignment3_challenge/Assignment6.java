package Assignment3_challenge;

public class Assignment6 {

	public static void main(String[] args) {
		
		
		String medium = "Steel";
		
		double  distance = 1078800;
		
		double time=0;
		
		final int airSpeed= 1100;
		
		final int waterSpeed = 4900;
		
		final int steelSpeed = 16400;
		
		switch (medium) {
			case "Air":
				
				time = (int)(distance/airSpeed);
				
				System.out.println("Time in the air "+ time+ " sec");
			
				break;
			case "Water":
				
				time =(int)(distance / waterSpeed);
				
				System.out.println("Time in the water " +time+" sec");
				
				break;
				
			case "Steel":	
				
				time= (int)(distance / steelSpeed);
				
				System.out.println("Time in the steel "+time+" sec");

				break;
				
			default:
				
				System.out.println("invalid value!");
				break;
		}
	}		

}
