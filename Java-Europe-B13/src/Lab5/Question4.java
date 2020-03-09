package Lab5;

public class Question4 {

	public static void main(String[] args) {
	
		int [] array = {1,2,3,4,5,6,7};
		
		System.out.println(SumOfArray(array));

	}

	private static int  SumOfArray(int[] array) {
		
		int sum=0;
		
		for (int i= 0; i<array.length;i++) {
			
			sum= sum+ array[i];
		}
		
		
		return sum;
	}

}
