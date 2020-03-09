package day31_wrapperClassSubject;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {

		ArrayList <String> languages= new ArrayList<>();
		
		languages.add("Turkish");
		
		languages.add("German");
		
		languages.add("English");
		
		languages.add("French");
		
		System.out.println(languages.size());
		
		System.out.println(languages.toString());
		
		languages.get(2);
		
		languages.add("Russian");
		
		System.out.println(languages.toString());
		
		languages.remove(0);
		
		System.out.println(languages.toString());
		
		System.out.println(languages.size());
		
		
	}

}
