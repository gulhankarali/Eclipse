package Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of female students :");
		
		int female = sc.nextInt();
		
		System.out.print("Enter the number of male students :");
		
		int male = sc.nextInt();
		
		System.out.println("Female students' percentage is :"+ 100*female/(male +female));
		
		System.out.println("Male students' percentage is :"+ 100*male/(male +female));
	}

}
