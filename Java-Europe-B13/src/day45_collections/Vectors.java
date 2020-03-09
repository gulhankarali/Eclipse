package day45_collections;

import java.util.List;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {

		List <String> v = new Vector<>();
		v.add("Tea");
		v.add("Coffee");
		v.add("Green tea");
	
		System.out.println(v.size());
		System.out.println(v.get(2));
				

	}

}
