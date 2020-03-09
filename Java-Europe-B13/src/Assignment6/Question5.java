package Assignment6;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the n number for Fibonacci Series :");
		
		int number = scan.nextInt();
		
		printArray(number);	

	}

	private static void printArray(int number) {
		
		for (int value: createArray(number)) {
			
			System.out.print(value+ " ");
		}
		
	}

	private static int[] createArray(int number) {
		
		int [] array = new int[number];
		
		int temp1=0, temp2=1;
		
		array[0]=0;
		
		array[1]=1;
	
		for (int i = 2; i<number; i++) {
			
			array[i]= temp1 +temp2;
			
			temp1= temp2;
			
			temp2= array[i];
			
		}
		
		return array;
	}

}
