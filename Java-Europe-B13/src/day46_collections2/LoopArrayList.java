package day46_collections2;

import java.util.*;

public class LoopArrayList {

	public static void main(String[] args) {

		List<Integer> nums= new ArrayList<>();
		
		nums.add(1);
		nums.add(3);
		nums.add(55);		
		nums.add(13);		
		nums.add(44);		
		nums.add(1000);
		nums.add(1100);
		
		for (int n:nums) {
			System.out.print(n+" | ");
		}
		System.out.println();
		
		for(int i=0; i<nums.size(); i++) {
			System.out.print(nums.get(i)+ " | ");
		}
		
		
		System.out.println();
		
		nums.forEach(n -> System.out.print(n+" | "));
		nums.removeIf(n -> n<500);
		
		System.out.println();
		
		nums.forEach(n -> System.out.print(n+" | "));

	}

}
