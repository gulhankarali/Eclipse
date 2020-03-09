package day17_classObjects;

import java.util.Scanner;

public class Task74 {

	public static void main(String[] args) {
		
		int sayi, toplam=0;
		
		Scanner scanner = new Scanner(System.in);
		
		do  {
			
			System.out.print("Enter number :");
			
			sayi = scanner.nextInt();
	
			if  (sayi<0)
				
				break;
		
			toplam= sayi+ toplam;
		   
			
		} while (true) ;
		
		System.out.println("Sum of the numbers ="+ toplam);
		
	}
	
}
