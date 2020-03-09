package day31_wrapperClassSubject;

import java.util.ArrayList;

public class containsMehtod {

	public static void main(String[] args) {
	
		
		ArrayList <String> list1 = new ArrayList <>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList <String> list2= list1;
		
		ArrayList <String> months = new ArrayList<>(list1);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		
		System.out.println(months.contains("Dec"));
		
		System.out.println(months.indexOf("Feb")==1);
		
		System.out.println(months.get(1).equals("Feb"));
		
		list1.add("Jan");
		
		
		System.out.println(list1);
		
		if (months.containsAll(list1))
			
			System.out.println(true);
		
		else 
			
			System.out.println("Some values are missing");

	}

}
