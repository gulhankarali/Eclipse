package day45_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;






public class ArrayVsArrayList {

	public static void main(String[] args) {

		int[] numsArray= {1,2,3,4,5,6};
		String [] days= {"Monday","Tuesday","Wednesday"};
		ArrayList <Integer> numList= new ArrayList<>();
		numList.add(55);
		numList.add(78);
		List <Integer> numList2= new ArrayList<>();
		
		System.out.println(numList.toString());
		LinkedList <Integer> list= new LinkedList<>();
		
		list.add(66);
		list.add(78);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.addFirst(1);
		list.addLast(99);
		
		System.out.println(list);
		
		
	}

}
