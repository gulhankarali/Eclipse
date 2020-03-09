package Repl;

public class Utils {

	public static String reverseLetters(String word){
		String reverse="";
	    char str[]= new char[word.length()];
		  int r = str.length-1;
			int l = 0; 
			for (int i=0; i<word.length(); i++){
			  str[i]=word.charAt(i);
			}
			while (l < r) 
	    { 
	      if (!Character.isAlphabetic(str[l])) 
	        l++; 
	      else if(!Character.isAlphabetic(str[r])) 
	        r--; 
	      else 
	      { 
	        char tmp = str[l]; 
	        str[l] = str[r]; 
	        str[r] = tmp;
	        l++; 
	        r--; 
	      } 
	    }
	    for (int i=0; i<str.length;i++) {
	    	reverse=reverse+str[i];
	    }
	    return reverse;
	}
}
