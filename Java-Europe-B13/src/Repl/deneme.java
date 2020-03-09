package Repl;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class deneme{
	  
	 private static void m1() throws Exception { //Line 6
         System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
     }
	 
	 
	    
	    
	    
	
		public static void main(String[] args)
		
		{
		
		     short [] args1 = new short[]{50, 50};
	         args1[0] = 5;
	         args1[1] = 10;
	         System.out.println("[" + args1[0] + ", " + args1[1] + "]");
			ArrayList<Integer> arr=new ArrayList<>();
			arr.add(1);
			arr.add(2);
			arr.add(3);
			arr.add(4);
			timesTwo(arr);
			
	
		         List<String> list1 = new ArrayList<>();
		         list1.add("A");
		         list1.add("D");
		 
		         List<String> list2 = new ArrayList<>();
		         list2.add("B");
		         list2.add("C");
		 
		         list1.addAll(1, list2);
		 
		         System.out.println(list1);
		         
		         LocalDate date = LocalDate.of(2012, 1, 11);
		         Period period = Period.ofMonths(2);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
		         System.out.print(formatter.format(date.minus(period)));
		 
		}
		//create your method below
		public static void timesTwo(ArrayList<Integer> nums){
		  ArrayList <Integer> array=new ArrayList<>();
		    int value=0;
		    int s= nums.size();
		    for (int i=0; i< s;i++){
		      array.add(nums.get(i)*2);
		    }
		    for(Integer each:array)
		        System.out.println(each);
		}
		
		
		
}

