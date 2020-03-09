package day25_arrays;

import java.util.*;

public class TaskDiff {

	public static void main(String[] args) {
		
		
		printArray(3);

	}

	private static void printArray(int i) {
		
		for (int value: createArray(i)) {
			
			System.out.println(value);
		}
		
	}

	private static int[] createArray(int number) {

		int[] array = new int[number];
		
		Random rand= new Random();
	
		
		for (int i=0; i<number; i++) {
			
			array[i]= rand.nextInt(100);
			
		}
		
		
		return array;
	}

}
