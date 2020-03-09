package day32_ArrayList;

import java.util.ArrayList;

public class GroceryList {

	static ArrayList <String> groceryList = new ArrayList<>();
	
	public static void printGroceryList() {
		
		System.out.println("You have "+ groceryList.size()+ " items in your list: ");
		for (int i=0; i<groceryList.size();i++) {
			System.out.println((i+1)+". item "+groceryList.get(i));
		}	
	}
	
	
	
	public static void addGroceryItem(String item) {
		
		groceryList.add(item);
		
	}
	
	public static void modifyGroceryItem(int itemNo, String item ) {
		groceryList.set(itemNo, item);
		System.out.println("Grocery item "+ itemNo + " has been modified");
	}
	
	public static void removeGroceryItem(int itemNo) {
		
		groceryList.remove(itemNo);
		
	}
	
	public static String findItem(String item) {
		
		int position= groceryList.indexOf(item);
		
		if (position>=0) 
			
			return groceryList.get(position);
		
		return null;
	}
}
