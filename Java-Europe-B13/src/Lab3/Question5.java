package Lab3;

import java.util.Scanner;

public class Question5 {
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the word:");
	
		String word =sc.nextLine();

		System.out.println(TwoLetters(word));
		
	}
	
	public static String TwoLetters(String word) {
		
		
		int length = word.length();
		
		if (length <2) {
			
			return word;
		
		} else if (word.isEmpty())
			
			return "";
		
		else { 
			
			String str= word.substring(0,2);
		
			return str;
		}
}

}
