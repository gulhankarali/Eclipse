package day17_classObjects;

import java.util.Scanner;

public class Task73 {

	public static void main(String[] args) {

		byte number= 9;
		
		byte input;
		
		Scanner scanner = new Scanner(System.in);
		
        do {
        	
        	System.out.print("Enter the number ");
        	
        	input = scanner.nextByte();

        	if (input<number) 
        		
        		System.out.print("Number is too small");
        	
        	else if (input >number)
        		
        		System.out.print("Number is too big");
        	
        	else {
        		
        		System.out.print("Congrat you got it");
             
        	}
        		
        } while( number != input);
	
	}

}
