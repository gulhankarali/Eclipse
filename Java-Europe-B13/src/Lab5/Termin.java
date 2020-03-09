package Lab5;

import java.util.Scanner;

public class Termin {

  
	public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    
    // your code 
    // ------------------------------------------
    String yesNo;
    String name;
    String partyList="";
    
    do {
      System.out.println("Please enter guest name:");  
      name= input.nextLine();
      System.out.println("Do you want to enter new guest name:");  
      yesNo= input.nextLine();
   
     
      partyList= partyList+name+", ";
      
    } while (yesNo.equalsIgnoreCase("yes"));
   System.out.print("Guest's list: ");
   System.out.println(partyList.substring(0,partyList.length()-2));
   
   
  
  }
}

