package day31_wrapperClassSubject;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
	
		ArrayList <String>  shoppingList= new ArrayList <>();
		
		shoppingList.add("Paper towel");

		shoppingList.add("dish soap");

		shoppingList.add("trash bag");

		shoppingList.add("gloves");

		shoppingList.add("whole meal");
		
		int count = shoppingList.size();
		
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0)+" "+(shoppingList.get(count-1)));
		
		shoppingList.remove("Paper towel");
		
		System.out.println(shoppingList.toString());	

	}

}
