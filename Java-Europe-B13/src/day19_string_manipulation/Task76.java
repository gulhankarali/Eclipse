package day19_string_manipulation;

public class Task76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Cybertek School";
		
		int length= str.length();
		
		for (int i=0; i <length; i++) {
			
			if (str.charAt(i)!=' ')
				
				System.out.println(str.charAt(i));
			else 
				continue;
		}
		
	}

}
