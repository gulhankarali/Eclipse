package day46_collections2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
	
		Set<Integer> mySet = new HashSet<>();
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(1000);
		mySet.add(1000);
		System.out.println(mySet);
		System.out.println(mySet.size());
		
		List<String> list= Arrays.asList("23","23","45","a","b","j");
		
		
		Set<String> unique= new HashSet<>(list);
		
		System.out.println(list);
		System.out.println(unique);
		
		TreeSet <Integer> tSet= new TreeSet();
		tSet.add(100);
		tSet.add(500);
		tSet.add(100);
		tSet.add(600);
		tSet.add(700);
		tSet.add(8000);
		
		System.out.println(tSet);
		
		
		
	}	
}
