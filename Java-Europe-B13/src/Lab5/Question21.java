package Lab5;

public class Question21 {

	public static void main(String[] args) {
		
		int [] array = {2,3,4,2,1,1,2,2,4};
		
		System.out.println(findEight(array));

	}
	
	public static boolean findEight(int [] array) {
		
		boolean flag= false;
		
		int sum= 0;
		
		for (int  value: array ) {
			
			if ( value==2) {
				
				sum=sum+2;
			}
		}
		
		if ((sum >8 )||(sum < 8))
		
			flag = false;
		else 
			
			flag = true;
		
		return flag;
	}

}
