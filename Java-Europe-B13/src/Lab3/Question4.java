package Lab3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Print thw word:");
		
			String word =sc.nextLine();

			System.out.println(ThreeTimes(word));
			
		}
		
		public static String ThreeTimes(String word) {
			
			
			int length = word.length();
			
			if (length <2) {
				
				return "Invalid data!";
			
			}
			else { 
				
				String str= word.substring(length-2);
			
				return str+str+str;
			}
	}

}
