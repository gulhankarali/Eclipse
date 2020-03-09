package Lab3;

import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the word:");
	
		String word1 =sc.nextLine();
		
		System.out.println(RotateUp(word1));
		
	}
	
	public static boolean RotateUp(String word1) {
		
		
		int length1 = word1.length();
		
		String str1 = word1.substring(0,2);
		
		String str2= word1.substring(length1-2);
		
		if (str1.equals(str2))
					
			return true;
		else 
			
			return false;

    }
}
