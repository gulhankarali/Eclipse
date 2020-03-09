package Lab3;

import java.util.Scanner;

public class Question0 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print the word:");
	
		String word1 =sc.nextLine();
		
		System.out.println(RotateUp(word1));
		
	}
	
	public static String RotateUp(String word1) {
		
		
		int length1 = word1.length();
		
		if (length1<3){
			
			return word1;
		}
		
		else { 
			
			String str1 = word1.substring(0,2);
			
			String str2 = word1.substring(2);
					
			return str2+str1;
			
		}	
    }
}
