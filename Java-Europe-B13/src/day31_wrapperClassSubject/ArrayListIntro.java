package day31_wrapperClassSubject;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<>();
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Mike");
		names.add("Ahmet");
		names.add("Erica");
		
		numbers.add(222);
		numbers.add(2829);
		numbers.add(3783);
		
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		
		System.out.println(numbers.get(2));
		
		System.out.println(numbers.size());
		
		System.out.println(names.toString());
		

	}

}
