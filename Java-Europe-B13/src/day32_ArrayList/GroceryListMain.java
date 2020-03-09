package day32_ArrayList;

import java.util.*;

public class GroceryListMain {

	
	static GroceryList groceryList = new GroceryList();
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean quit= false;
		int menu;
		PrintInstructions();
		do {
			System.out.print("Enter your choice: ");
			menu = scan.nextInt();
			scan.nextLine();
			switch (menu) {
			case 0: PrintInstructions(); break;
			case 1: 
				System.out.println("Print the items: ");
				groceryList.printGroceryList();
				break;
			case 2: System.out.println("Add the items: "); 
				addItem();
				break;
			case 3: System.out.println("Modify items: "); 
				modifyItem();
				break;
			case 4: System.out.println("Remove the items: "); 
				removeItem();
				break;
			case 5: System.out.println("Search the items: "); 
				searchItem();
				break;
			case 6:  quit = true; break;
			default: break;
			}
		
		} while (!(quit));

	}
	
	public static void searchItem() {
		System.out.println("Enter search item: ");
		String item= scan.nextLine();
		if (groceryList.findItem(item)!=null)
		{
			System.out.println("Found the item in your grocery list!");
		}
		else 
		{
			System.out.println("Not found item in your grocery list!");
		}
		
		
	}

	public static void removeItem() {
		
		System.out.println("Enter item number: ");
		int itemNo = scan.nextInt();
		scan.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
		
	}

	public static void modifyItem() {
		
		System.out.println("Enter the number: ");
		int itemNo= scan.nextInt();
		scan.nextLine();
		System.out.println("Replacement item: ");
		String newItem = scan.nextLine();
		groceryList.modifyGroceryItem(itemNo-1,newItem);
	}

	public static void addItem() {
		
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryItem(scan.nextLine());
		
	}

	
	
	public static void PrintInstructions() {
		
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
		
	}
	

}
