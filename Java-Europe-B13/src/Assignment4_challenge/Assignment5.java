package Assignment4_challenge;

public class Assignment5 {

	public static void main(String[] args) {
	
		int k=0;
		
		for (int i=1; i<=7; i++) {
			
			for (k=1; k<=7-i; k++) {
			
				System.out.print(1);
				
			}
			
			for (int j=k; j<=7; j++ ) {
				
				System.out.print(i);
			}
			
				
			System.out.println(" ");	
		}

	}

}
