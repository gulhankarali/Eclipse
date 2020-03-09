package day46_collections2;

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String, Double> map= new HashMap<>();
		map.put("apples", 3.44);
		map.put("flowers", 1.44);
		map.put("pears", 2.28);
		map.put("eggs", 3.90);
		map.put("bread", 3.77);
		map.put("apples", 2.4);
		
		System.out.println(map.size());
		System.out.println(map.get("apples"));
		System.out.println(map.get("pears"));
		System.out.println(map.get("flowers"));
		System.out.println(map.get("eggs"));
		System.out.println(map.get("bread"));
		
		map.remove("bread");
		System.out.println(map);
		System.out.println(map.containsKey("apples"));
		map.replace("eggs", 4.5);
		System.out.println(map);
		
		double x= 2.0;
		map.replace("flowers", map.get("flowers")+x);
		System.out.println(map);
		
		
		

	}

}
