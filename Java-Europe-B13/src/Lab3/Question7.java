package Lab3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the word:");
	
		String word =sc.nextLine();

		System.out.println(middleOfWord(word));
		
	}
	
	public static String middleOfWord(String word) {
		
		
		int length = word.length();
		
		if (length<3) {
			
			return "Invalid Data!";
		}
		
		else { 
			
			String str= word.substring(1);

			str = str.substring(0,length-2);
			
			return str;
			
		}	
    }

}
