package Assignment4_challenge;

public class Assingment2 {

	public static void main(String[] args) {
	
		int k=0;
		
		for (int i =7; i>=1; i--) {
			
			for (k=1; k<=7-i; k++)
				
				System.out.print(" ");
			
			
			for (int j=k; j<=7; j++) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
	    k=0;
		
		for (int i =1; i<=7; i++) {
			
			for (k=1; k<=7-i; k++)
				
				System.out.print(" ");
			
			
			for (int j=k; j<=7; j++) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
		
	}

}
