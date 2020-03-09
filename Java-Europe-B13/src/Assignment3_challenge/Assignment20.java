package Assignment3_challenge;

public class Assignment20 {

	public static void main(String[] args) {
		
		String  c1 = "W ", c2= "B ";
		
		for (int i=1; i<=8; i++) {
			
			if (i%2==0) {
				
				 c1 ="B "; c2= "W ";
			}
			else {
				
				 c1 = "W "; c2= "B ";
			}
			
			for (int j=1; j<=8; j++) {
				
				if (j%2==1)
					System.out.print(c1);
				else 
					System.out.print(c2);
			}
			System.out.println("");
		}

	}

}
