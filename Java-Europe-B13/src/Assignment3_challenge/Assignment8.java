package Assignment3_challenge;

public class Assignment8 {

	public static void main(String[] args) {

		double baseFee = 10;
		
		double checkFee =0;
		
		double  numberChecks = 80;
		
		if (numberChecks<20) {
			
			checkFee= baseFee+ numberChecks*0.1;
			
		} else if (numberChecks>=20 && numberChecks<39) {
			
			checkFee= baseFee+ numberChecks*0.08;
			
		} else if (numberChecks>=40 && numberChecks<59) {
			
			checkFee= baseFee+ numberChecks*0.06;
		
        } else if (numberChecks>=60) {
			
			checkFee= baseFee+ numberChecks*0.04;
			
        }	
		
		System.out.println("This month's check fee is : £"+ checkFee);
			
		
	}

}
