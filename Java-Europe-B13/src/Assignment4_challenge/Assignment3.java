package Assignment4_challenge;

public class Assignment3 {

	public static void main(String[] args) {
		
		String x="";
		
		int j=0;
		
		for (int i=0; i<=6; i++) {
			
			for (j=i+1; j<=7; j++) {
					
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
		for (int i=6; i>0; i--) {
			
			for (j=i; j<=7; j++) {
				
				System.out.print(j);
				
			}
			System.out.println(" ");
		}
		
	}

}
