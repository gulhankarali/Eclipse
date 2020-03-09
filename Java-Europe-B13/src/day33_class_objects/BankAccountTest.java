package day33_class_objects;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {

		String input;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What is your starting balance :");
		
		input=scan.nextLine();
		
		BankAccount bankAccount = new BankAccount(input);
		
		System.out.println("How much deposit do you do :");

		input=scan.nextLine();
		
		bankAccount.deposit(input);
		
		System.out.println("Account balance is :"+ bankAccount.getBalance());
		
		

	}

}
