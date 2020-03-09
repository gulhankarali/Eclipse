package Lab5;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
		int [] array1 = {0,1,3,4,5,6,75};
		
		int [] array2 =new int[2];
		
		FillInArray(array1, array2);
		

	}

	private static void FillInArray(int[] array1, int[] array2) {
	
		array2[0]=array1[0];
		array2[1]= array1[array1.length-1];
		
		System.out.println(Arrays.toString(array2));
		
	}

}
