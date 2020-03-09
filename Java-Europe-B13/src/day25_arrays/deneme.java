package day25_arrays;

import java.util.Scanner;

public class deneme {

 
	 public static void main(String[] args) {
		    double price = 0.0;
				String storageType, screenType, cpu;
				int ram = 0 ;
				Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE
		    
		    int memory;
		    
		    System.out.println("Select screen size:");
		    
		    screenType= scan.next();
		    
		    if (screenType.equals("13.3")) {
		      price= price + 200.0;}
		    else if (screenType.equals("15.0")) {
		      price = price +300.0;}
		    else if (screenType.equals("17.3")) {
		      price = price +400.0;}
		    
		    System.out.println("Select CPU type:");
		    cpu= scan.next();
		    
		    if (cpu.equals("i3"))
		      price= price + 150.0;
		    else if (cpu.equals("i5"))
		      price = price +250.0;
		    else if (cpu.equals("i7"))
		      price = price +350.0;
		      
		    System.out.println("Select RAM size:");
		    ram= scan.nextInt();
		    ram= ram/4;
		    price = price + 50.0*ram;
		    
		    scan.nextLine();
		    
		    System.out.println("Select storage type:");
		    storageType= scan.next();
		    
		    System.out.println("Select memory size:");
		    memory= scan.nextInt();
		    
		    if (storageType.equals("SSD")){
		      memory= memory/500;
		      price = price+ 50.0*memory;
		    }  else if (storageType.equals("HDD")){
		      memory= memory/500;
		      price = price +100.0*memory;
		    }    
		    
		    scan.nextLine();
		    
		    System.out.println("Select screen resolution:");
		    screenType= scan.next();
		    
		    if (screenType.equals("FULLHD")) {
		      price= price + 100.0;}
		    else if (screenType.equals("4K")) {
		        price= price + 200.0;}
		  
		    System.out.println("Laptop price is: $"+price);  
		    
		  }
	 
}