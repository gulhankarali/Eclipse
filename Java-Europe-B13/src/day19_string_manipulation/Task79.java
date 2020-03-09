package day19_string_manipulation;

public class Task79 {

	public static void main(String[] args) {

		String str = "Cybertek Schoolllloioi";
		
		String wovel="";
		
		int length= str.length();
		
		for (int i=0; i< length; i++) {
			
			char ch = str.charAt(i);
			
			if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				wovel=wovel+ch;
				
			}
		}
		
		length= wovel.length();
		
		for (int i=0; i<length; i++) {
			
			if (i!=length-1)
			
				System.out.print(wovel.charAt(i)+",");
			
			else 
				
				System.out.print(wovel.charAt(i));
			
		}
	}

}
