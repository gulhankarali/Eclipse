package Lab5;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		int [] array= {1000,457,65,332,1,2,0,8};
		
		findTheBiggest(array);
		
		
	}

	private static void findTheBiggest(int[] array) {
	
		int max= 0;
		
		for (int i =0; i<array.length; i++) {
			
			if (array[i]>max) {
				
				max= array[i];
				
			
			}
		
		}
		
		for (int j= 0;j<array.length;j++)
			
			array[j]= max;
		
		System.out.println(Arrays.toString(array));
		
	}

}
