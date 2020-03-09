package day13_methods;

public class callingMethods {

	public static void main(String[] args) {
		
		System.out.println("hello from the main method");
		for (int i=1; i<5;i++) {
			displayMessage();
			System.out.println("back in the main method");
		}
	
		displayMe();
	}
	
	private static void displayMe() {
		
		
	}

	public static void displayMessage() {
		System.out.println("Hello from the method");
	}

}
