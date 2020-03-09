package Lab5;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {13,2,3,4,13,5};
		
		System.out.println(SumOfElements(array));
		
	}
	
	public static int SumOfElements(int [] array) {
	
		int sum=0;
		
		for (int i =0; i<array.length; i++) {
			
			if (array[i]==13)
				
				break;
			else 
				sum= sum+ array[i];
		}
			
			
		
	return sum;
	}
	
}
