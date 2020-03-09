package Lab3;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the 1. word:");
	
		String word1 =sc.nextLine();

		System.out.print("Print the 2. word:");
		
		String word2 =sc.nextLine();
		
		System.out.println(WrapUp(word1, word2));
		
	}
	
	public static String WrapUp(String word1, String word2) {
		
		
		int length1 = word1.length();
		
		int length2 = word2.length();
		
		if (length1==length2) {
			
			return "Invalid Data!";
		}
		
		else { 
			
			if (length1>length2)
				
				return word2.concat(word1).concat(word2);

			else 
				
				return word1.concat(word2).concat(word1);
			
		}	
    }
}
