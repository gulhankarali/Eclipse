package day25_arrays;

import java.util.Arrays;

import java.util.Scanner;

public class SameArray {

	public static void main(String[] args) {
	
		int [] array1= {1,2,3,4,5};
		
		int [] array2= {6,7,8,9,10};
		
        array1= array2;
        
        String[] array3 = {"a","b","c"};
        
        System.out.println(Arrays.toString(array1));
        
        setValue(array1);
        
        showValue(array1);
        
        String[] values;
        
        values = showValue();
        
        for (String val: values) {
        	
        	System.out.println(val);
        }
	}

	private static String[] showValue() {
		
        String[] array= {"a","b"}; 		
		
		return array;
	}

	private static void showValue(int[] array) {
		
		for (int val: array) {
			
			System.out.println(val);
		}
	}

	public static void setValue(int[] array) {
		
		Scanner scan= new Scanner(System.in);
		
		for (int i=0; i<array.length; i++) {
			
			System.out.print("Enter number :");
			
			array[i]= scan.nextInt();
		
		}	
	}
}
