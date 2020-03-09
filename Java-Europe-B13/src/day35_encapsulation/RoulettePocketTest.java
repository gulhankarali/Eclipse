package day35_encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter the number");	
		int number= scan.nextInt();
		
		RoulettePocket roulettePocket=new RoulettePocket(number);
		do {
			System.out.println("Enter the number");
			roulettePocket.setNumber(scan.nextInt());
			System.out.println(roulettePocket.getPocketColour());
			
			
		} while (roulettePocket.getPocketColour().equalsIgnoreCase("invalid"));
		
		
	}

}
