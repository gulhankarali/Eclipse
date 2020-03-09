package day46_collections2;


import java.util.*;

public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> nums= new HashSet<>();
		
		nums.add(1);
		nums.add(3);
		nums.add(55);		
		nums.add(13);		
		nums.add(44);		
		nums.add(1000);
		nums.add(1100);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		for(int n:nums) {
			System.out.print(n+" | ");
		}
		
		nums.forEach(n -> System.out.print(n+" | "));
		
		
		

	}

}
