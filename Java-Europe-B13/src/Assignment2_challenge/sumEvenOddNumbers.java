package Assignment2_challenge;

public class sumEvenOddNumbers {

	public static void main(String[] args) {
	
		int sum1=0, sum2=0;
		
		for (int i=0; i<=100; i++) {
			
			if (i%2==0) {
				sum1= sum1+i;
				
			}else {
				sum2= sum2+i;
				
			}
		}

		System.out.println(sum1);
		System.out.println(sum2);
	}

}
