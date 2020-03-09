package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
		
		char array[] = new char[] {'A','Z','B','N','P','T','X','C'};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the letter to find :");
		
		String found = scan.next();
		
		boolean flag= false;
	
		for (char value: array) {
				
			if (value==found.charAt(0)) {
			
				flag= true;
					
				break;
				
			}
				
			else 
				
				flag= false;
		
		}
		
		if (flag)
			
			System.out.println(found+ " found!");
		else 
			System.out.println(found+ " not found!");
	}	
}
