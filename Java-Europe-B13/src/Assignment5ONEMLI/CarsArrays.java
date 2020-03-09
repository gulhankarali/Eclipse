package Assignment5ONEMLI;

import java.util.Scanner;

public class CarsArrays {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter how many cars you want to enter :");
		
		int cars= scan.nextInt();
		
		System.out.print("Enter the name of the car you want to find :");
		
		String  carName= scan.next();
		
		System.out.println(findCar(cars, carName));	
		
	}

	private static boolean findCar(int arraySize, String string) {
		
		for (String value : createArray(arraySize)) {
			
			if (value.equalsIgnoreCase(string)) {
				
				return true;
			}
		}
		
		return false;
	}	

	private static String[] createArray(int arraySize) {
		
		Scanner scan= new Scanner(System.in); 
		
		String [] array = new String[arraySize];
		
		for (int i=0; i<array.length; i++) {
			
			System.out.print( "Enter your car #  "+ (i+1));
			
			array[i]= scan.next();
		}
		
		return array;
	}

}
