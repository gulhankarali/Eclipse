package Lab3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print your name :");
	
		String name=sc.nextLine();
		
		System.out.println(Hello(name));
		
	}
	
	public static String Hello (String name) {

		return "Hello ".concat(name).concat("!");
		
	}

}
