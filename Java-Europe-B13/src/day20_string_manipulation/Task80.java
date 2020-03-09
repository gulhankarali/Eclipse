package day20_string_manipulation;

import java.util.Scanner;

public class Task80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner str11 = new Scanner(System.in);
		
		String string1 = str11.nextLine();
		
		Scanner str22 = new Scanner(System.in);
		
		String string2 = str22.nextLine();
		
		checkStrings(string1,string2);
		

	}
	
	private static void checkStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if (str1.contains(str2))
			
			System.out.println(str1.indexOf(str2));
		else 
			
			System.out.println("Not found");
		
	}

}
