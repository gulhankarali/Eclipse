package day33_class_objects;

public class BankAccount {
	
	double balance;
	
	public BankAccount() {
		
		balance=0.0;
	}
	
	public BankAccount(double startBalance ) {
		
		balance=startBalance;
	}
	
	public BankAccount(String startBalance) {
		
		balance=Double.parseDouble(startBalance);
		
		
	}
	
	public void deposit(double amount) {
		
		balance= balance+amount;
		
	}
	
	public void deposit(String amount) {
		
		balance=balance+Double.parseDouble(amount);
		
	}
	
	public double getBalance() {
	
		return balance;
	}	

}
