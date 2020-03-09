package day46_collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWithIterator {

	public static void main(String[] args) {
		
		Set<Integer> nums= new HashSet<>();
		
		nums.add(111);
		nums.add(3);
		nums.add(55);		
		nums.add(13);		
		nums.add(44);		
		nums.add(1000);
		nums.add(1100);
		
		nums.add(3100);
		nums.add(4100);
		
		System.out.println(nums);
		
		Iterator<Integer> it= nums.iterator();
		
		System.out.println(it.hasNext()); // returns true if it has next value, return false when reaches the end
		
		
		System.out.println(it.next()); // returns the current value and moves to next value
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		while (it.hasNext()) {
			System.out.print(it.next()+" | ");
		}
		
		
		
		Iterator<Integer> it2= nums.iterator();
		
		while (it2.hasNext()) {
			int value= it2.next();
			if (value>1000) {
				
				it2.remove();
				}
		}
					
		System.out.println(nums+ " | ");
		
		for (Integer n: nums) {
			nums.remove(new Integer(n));
		}
		
		System.out.println(nums);
		
	//	System.out.println(it.next());
	}

}
