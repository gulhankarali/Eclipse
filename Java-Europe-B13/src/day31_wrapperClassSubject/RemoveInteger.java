package day31_wrapperClassSubject;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {

		ArrayList <Integer> nums = new ArrayList<> ();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		
		nums.add(1);
		nums.add(41);
		nums.add(14);
		nums.add(144);
		nums.add(133);
		nums.add(122);
		nums.add(78);
		
		System.out.println(nums.toString());
		
		nums.remove(5);
		System.out.println(nums.toString());
		
		Integer n1= new Integer(41);
		
		Integer n2= Integer.valueOf(78);
		
		nums.remove(n1);
		
		nums.remove(n2);
		
		nums.remove(new Integer(78));
		
		System.out.println(nums.toString());
		
		
	}

}
