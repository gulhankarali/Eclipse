package day25_arrays;

import java.util.Arrays;

import day24_arrays.arrays;

public class Task92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[10];
		
		for (int i =0; i <10; i++) {
			
			numbers[i]= i+1;
			
			
		}
		for (int i =0; i <10; i++) {
			
			numbers[i]= numbers[i]*19;
			
		}
		for (int i =0; i <10; i++) {
			
			
			
		}
		
		System.out.println(Arrays.toString(numbers));
		
		

	}

}
