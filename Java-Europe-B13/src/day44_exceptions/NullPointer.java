package day44_exceptions;

public class NullPointer {
	
	static String name;

	public static void main(String[] args) {
		
		try {
			System.out.println(name.toUpperCase());
		}
		catch (NullPointerException e) {
			System.out.println("nullpointer exception happened");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
