package day25_arrays;

import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray= new int[10];
		
		Random ran = new Random();
		
		for (int i=0; i< myArray.length; i++) {
			
			myArray[i]= ran.nextInt(100);
			
			System.out.println(myArray[i]);
		}
		
	}

}
