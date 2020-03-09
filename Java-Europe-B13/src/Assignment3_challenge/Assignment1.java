package Assignment3_challenge;

public class Assignment1 {

	public static void main(String[] args) {
		
		// I need to add leap year algorithm too, yet I did not know how to convert things into each other, as such
		// I left it like that
		
		
		boolean nonRealistic;
		
		for (int i=1;i<=99; i++) {
			for (int j=1;j<=12;j++) {
				for (int k=1;k<=31;k++) {
					
					// here, I am eliminating the non-existing dates of the year, like 30 feb, or 31 april etc. 
					
					if ((j==2)&&((k==30)||(k==31))||((j==4)&&(k==31))||((j==6)&&(k==31))||((9==4)&&(k==31))||((11==4)&&(k==31))) 
						nonRealistic= true;
					else if (j*k==i) {
						System.out.println("it is a magic year! Day "+k+" \t Month "+j+" \t Year "+i);
					
				//	} else {
				//		System.out.println("it is not a magic year!");
					}
				}
			}
		}
	}
}
