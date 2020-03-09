package Lab5;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6};
		
		RotateLeft(array);
	
	}

	private static void RotateLeft(int[] array) {
		
		int [] temp= new int[array.length];
		
		for (int i = 0; i<array.length;i++) {
			
			temp[array.length-i-1]= array[i];
			
		}
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(temp));
		
		
	}

}
