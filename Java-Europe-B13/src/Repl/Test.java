package Repl;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }




	 
	    
	     public static void main(String[] args) {
	    
		     System.out.println("HELLO");
		
	    
	    	 
	    	 ArrayList<Integer> list = new ArrayList<Integer>();
	         list.add(new Integer(2));
	         list.add(new Integer(1));
	         list.add(new Integer(0));
	 
	      
	         list.remove(list.indexOf(0));
	 
	         System.out.println(list);
	         
	    	  int a = 100;
	          System.out.println(-a++);
	    	 int grade = 60;
	         if(grade == 60)
	             System.out.println("You passed...");
	         else
	             System.out.println("You failed...");
	  
	             StringBuilder sb = new StringBuilder("Java");
	             String s1 = sb.toString();
	             String s2 = sb.toString();
	     
	             System.out.println(s1);
	             System.out.println(s2);
	   	      
	             System.out.println(s1 == s2);
	      
	         StringBuilder sb1 = new StringBuilder();
	         System.out.println(sb1.append("null").length());
	         LocalDateTime obj = LocalDateTime.now();
	         System.out.println(obj.getSecond());
	     
	     int i = 5;
	     }
   
}
