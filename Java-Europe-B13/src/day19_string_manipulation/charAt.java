package day19_string_manipulation;

public class charAt {

	public static void main(String[] args) {

		String str ="Computer";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.charAt(4));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.charAt(7));
	
	
		String word ="Apple";
		
		if (word.charAt(0)=='A')
		
			System.out.println(true);
		
		else 
			
			System.out.println(false);
		
		
		
		String word1 = "civic";
		
		if (word1.charAt(0)==word1.charAt(word1.length()-1))
			
			System.out.println(true);
		
		else 
			
			System.out.println(false);
	}

}
