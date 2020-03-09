package Lab3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print a:");
	
		String a=sc.nextLine();
		
		System.out.print("Print b:");
		
		String b=sc.nextLine();
		
		System.out.println(Concat(a, b));
		
	}
	
	public static String Concat (String a, String b) {
		
		return a.concat(b).concat(b).concat(a);
		
	}

}
