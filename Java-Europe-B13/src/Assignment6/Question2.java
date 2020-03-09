package Assignment6;

public class Question2 {

	public static void main(String[] args) {
	
		printArray(createArray(10));
	
	}

	public static int[] createArray(int size) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i =0; i<size; i++) {
			
			array[i] = 19*(i+1);
		}
		
		return array;
		
	}
	
	public static void printArray(int[] array) {
		
		for (int value : array)
		
			System.out.println(value);
		
	}
}
