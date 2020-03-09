package day44_exceptions;

public class TryCatch {

	public static void main(String[] args) {

		try {
			String str= "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(5));
		
		}
		catch (Exception e)
		{
			System.out.println("Exception happened while running the code");
		}

	}
}
