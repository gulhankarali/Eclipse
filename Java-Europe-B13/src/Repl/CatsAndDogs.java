package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class CatsAndDogs {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.nextLine();
		    String cat=null;
		    int j=0, k=0;
		    
		    for (int i=0; i<word.length(); i++) {
		
		    	if (word.substring(i,i+1).equals("c")) {
		  
		        	if  (word.substring(i+1,i+2).equals("a")) {
		        		
		            	if (word.substring(i+2,i+3).equals("t")) {
		            		
		            		cat=word.substring(i)+word.substring(i+1)+word.substring(i+2);
		            		
		            		j=j+1;
		            		
		            	}
		        	}	
		    	}	
		    }

		    for (int i=0; i<word.length(); i++) {
				
		    	if (word.substring(i,i+1).equals("d")) {
		  
		        	if  (word.substring(i+1,i+2).equals("o")) {
		        		
		            	if (word.substring(i+2,i+3).equals("g")) {
		            		
		            		cat=word.substring(i)+word.substring(i+1)+word.substring(i+2);
		            		
		            		k=k+1;
		            		
		            	}
		        	}	
		    	}	
		    }
		    
		    if (j==k) {
		    	System.out.println(true);
		    	
		    }
		    else 
		    	System.out.println(false);
    }

}
