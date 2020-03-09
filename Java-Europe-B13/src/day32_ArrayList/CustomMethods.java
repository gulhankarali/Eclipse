package day32_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList <Integer> numsList = new ArrayList<>(); 
		
		numsList.add(7);
		
		numsList.add(8);
		
		numsList.add(2);
		
		numsList.add(3);
		
		numsList.add(8);
		
		numsList.add(4);
		
		printList(numsList);
		
		ArrayList <Double> doubleList = new ArrayList<>();
		
		doubleList.add(1.2);
		
		doubleList.add(4.22);
		
		doubleList.add(3.322);
		
		doubleList.add(1.0);
		
		doubleList.add(32.45);
		
		double sum = sumList(doubleList);
		
		System.out.println(sum);
		
		ArrayList <Integer> list = getList(15);
		
		System.out.println(list);
		
		ArrayList <Integer> rList = getRandomList(20);
		
		System.out.println(rList);
		
		ArrayList<String> strNums = new ArrayList<>();
		
		strNums.add("134");
		
		strNums.add("902");
		
		strNums.add("78");
		
		ArrayList <Integer> converted=  convertToIntList(strNums);
		
		System.out.println(converted);
		
	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> strNums) {

		ArrayList <Integer> list = new ArrayList<>();
		
		String temp;
		
		for (String value: strNums) {
			
			Integer deger= new Integer(value);
			
			list.add(deger);		
		}
			
	
		
		return list;
	}

	public static ArrayList<Integer> getRandomList(int i) {
	
		ArrayList <Integer> list1 = new ArrayList<>();
		
		Random r=new Random();
		
		for (int j=0; j<i; j++) {		
			
			int num = r.nextInt(i);
		
			Integer number = new Integer(num);
			
			list1.add(number);
		
		}	
		
		return list1;
	}

	public static ArrayList<Integer> getList(int i) {
	
		ArrayList <Integer> list1 = new ArrayList<>();
		
		for (int j=0; j<i; j++)
			
			list1.add(j+1);
		
		return list1;
	}

	public static double sumList(ArrayList<Double> doubleList) {

		double sum=0.0;
		
		for (Double value: doubleList)
		  
			sum=sum+value;
		
		return sum;
	}

	public static void printList(ArrayList<Integer> numsList) {
		
		for (Integer value: numsList)
			
			System.out.println(value+ " ");	
		
	}

}
