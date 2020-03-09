package Assignment3_challenge;

public class Assignment21 {

	public static void main(String[] args) {
		
		for (int i=1; i<=8; i++) {
			
			for (int j=1; j<=i; j++) {
				
				if ((j==1)||(j==i)){
	
					if (i==1)
					
						System.out.print(" ");
						
					else 
						
						System.out.print("#");
					
					
				} else 
					
					System.out.print(" ");
			}
			
			System.out.println(" ");
		}

	}

}
