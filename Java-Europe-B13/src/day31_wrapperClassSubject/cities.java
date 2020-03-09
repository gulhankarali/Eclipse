package day31_wrapperClassSubject;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList <String> cities = new ArrayList<> ();
		
		cities.add("Baku");
		
		cities.add("London");
		
		cities.add("DC");
		
		cities.add("Berlin");
		
		cities.add("Baku");
		
		for (String value: cities) {
			
			System.out.println(value);
		}
		
		System.out.println("++++++++");
		
		for (int i= 0; i<cities.size(); i++) {
			
			System.out.println(cities.get(i));
			
		}
		
		System.out.println(cities.remove("Baku"));
		
		System.out.println(cities.toString());
		
		cities.add(1,"Istanbul");
		
		cities.add(0, "Ankara");
		
		System.out.println(cities.toString());
		
		int index= cities.indexOf("Bursa");
		
		System.out.println(index);
		
		cities.clear();
		
		boolean isit= cities.isEmpty();
		
		System.out.println(isit);
		
	}

}
