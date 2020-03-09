package Lab4;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		
		String str=sc.nextLine();
		
		String dummy="";
		
		for (int i =str.length()-1;i>=0 ;i--) {
			
			dummy= dummy+str.charAt(i);
			
		}
		
		if (str.replace(" ","").equalsIgnoreCase(dummy.replace(" ","")))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
