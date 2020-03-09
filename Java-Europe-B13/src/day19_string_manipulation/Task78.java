package day19_string_manipulation;

public class Task78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int j=0;
		
		String str= "ababaccabacbbea";
		
		char myChar='x';
		
		int length= str.length();
		
		for (int i=0; i<length; i ++) {
			
			if (myChar== str.charAt(i))
				
				j++;
			else
				continue;
			
		}
		
		System.out.println("The letter "+myChar +" is " + j+ " times in the word \""+str+"\"" );
	}

}
