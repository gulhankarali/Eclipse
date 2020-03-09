package day13_methods;

import java.util.Calendar;

public class Task61 {

	public static void main(String[] args) {
		
		calculateAge(1973);
	}

	private static void calculateAge(int i) {
		
		
		int year = Calendar.getInstance().get(Calendar.YEAR);

		
		System.out.println("Your age is :" + (year -i));
		
	}

}
