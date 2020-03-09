package Lab3;

import java.util.Scanner;

public class Question6 {
	
		
		public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Print the word:");
		
			String word =sc.nextLine();

			System.out.println(HalfOfWord(word));
			
		}
		
		public static String HalfOfWord(String word) {
			
			
			int length = word.length();
			
			if (length%2!=0) {
				
				return "Invalid Data!";
			}
			
			else { 
				
				length=length/2;
				
				String str= word.substring(0,length);
			
				return str;
				
			}	
	}

}
