package Lab5;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6,7};
		
	
		System.out.println(Arrays.toString(swapArray(array)));
	
	}

	private static int [] swapArray(int[] array) {
		
		int temp=array[0];
		
		array[0]=array[array.length-1];
		
		array[array.length-1]=temp;
		
		return array;
		
	}

}
