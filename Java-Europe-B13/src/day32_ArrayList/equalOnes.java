package day32_ArrayList;

import java.util.ArrayList;

public class equalOnes {

	public static void main(String[] args) {

		ArrayList <String> friends1 = new ArrayList<>();
		
		friends1.add("Mike");
		friends1.add("Smith");
		friends1.add("John");
		friends1.add("Mary");
		
	ArrayList <String> friends2 = new ArrayList<>();
		
		friends2.add("Mike");
		friends2.add("Smith");
		friends2.add("John");
		friends2.add("Mary");

		
		System.out.println(friends1);
		
		System.out.println(friends2);
		
		if (friends1.equals(friends2))
			
			System.out.println("Same Friends");
		else
			
			System.out.println("Different Friends");
	
		

	}

}
