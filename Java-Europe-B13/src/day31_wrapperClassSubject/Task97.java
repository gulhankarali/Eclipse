package day31_wrapperClassSubject;

public class Task97 {

	public static void main(String[] args) {
		
		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		String Java="";
		
		for (int i =0; i <s.length()-1; i++) {
		
			
			if ((s.charAt(i)==' ')||(Character.isLetter(s.charAt(i)))) {
		  				    
				Java= Java+s.charAt(i) ;
			}
		}	
	
		System.out.println(Java);	

	}

}
