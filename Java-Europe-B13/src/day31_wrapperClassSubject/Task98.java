package day31_wrapperClassSubject;

public class Task98 {

	public static void main(String[] args) {
   
		 String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	     decodeTheCode(str1);
	        
         String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
         decodeTheCode(str2);
	}
	
	public static boolean FindFirst(String temp, int n1, int n2) {
	
		String number= "";
		
		boolean flag=false;
		
		
		if (n2>temp.length())
			n2= temp.length();
		
		
	if  (temp.substring(n1,n2).equalsIgnoreCase("One")) {
			
		number=number+"1";
		
		flag= true;
		
	}
					
	else  if (temp.substring(n1,n2).equalsIgnoreCase("two")) {
		
		number=number+"2";
		
		flag= true;
		
		
	}
	
	else  if (temp.substring(n1,n2).equalsIgnoreCase("six")) {	
		
		number=number+"6";
		flag= true;
	}
	
	System.out.print(number);

	return flag;
	
	}
	
	public static boolean FindSecond(String temp, int n1, int n2) {
		
		String number= "";
		
		boolean flag = false;
		
		
		if (n2>temp.length())
			n2= temp.length();

		if (temp.substring(n1,n2).equalsIgnoreCase("zero")) {	
		
			number=number+"0";
			flag= true;
		}

		else  if (temp.substring(n1,n2).equalsIgnoreCase("four")) {	
		
			number=number+"4";
			flag= true;

		}
	
		else  if (temp.substring(n1,n2).equalsIgnoreCase("five")) {
		
			number=number+"5";
			flag= true;
		
		}
	
		else  if (temp.substring(n1,n2).equalsIgnoreCase("nine")) {
		
			number=number+"9";
			flag= true;
		}
		
		System.out.print(number);
		return flag;

	}		
	
	
	public static boolean FindThird(String temp, int n1, int n2) {
		
		String number= "";
		
		boolean flag= false;
		
		if (n2>temp.length())
			n2= temp.length();
	
		if (temp.substring(n1,n2).equalsIgnoreCase("three"))	{
		
			number=number+"3";
			flag= true;
	}
	
	else  if (temp.substring(n1,n2).equalsIgnoreCase("seven")) {
		
		number=number+"7";
		flag= true;
	}
	
	else  if (temp.substring(n1,n2).equalsIgnoreCase("eigth")) {
		
		number=number+"8";
		flag= true;
	}
	
		System.out.print(number);
		return flag;	
	}


	private static String decodeTheCode(String str1) {
		
		String temp="";
		
		String number="";
		
		String numbers="";
		
		for (int i=0; i<str1.length(); i++) {
			
			if (Character.isLetter(str1.charAt(i))) {
				
				temp=temp+str1.charAt(i);
			}
		}
		
		System.out.println(temp);
		
		if (FindFirst(temp,0,3)) {}
		else if (FindSecond(temp,0,4)) {}
		else if (FindThird(temp,0,5)) {	}
		
		if (FindFirst(temp,3,6)) {}
		else if (FindSecond(temp,3,7)) {}
		else if (FindThird(temp,3,8)) {}
				
			
		if (FindFirst(temp,6,9)) {}
		else if(FindSecond(temp,6,10)) {}
		else if (FindThird(temp,6,11)) {}
					
		
		if (FindFirst(temp,4,7)) {}
		else if(FindSecond(temp,4,8)) {}
		else if (FindThird(temp,4,9)) {}
		
		if (FindFirst(temp,5,8)) {}
		else if(FindSecond(temp,5,9)) {}
		else if (FindThird(temp,5,10)) {}
		
		if (FindFirst(temp,7,10)) {}
		else if(FindSecond(temp,7,11)) {}
		else if (FindThird(temp,7,12)) {}
		
		if (FindFirst(temp,8,11)) {}
		else if(FindSecond(temp,8,12)) {}
		else if (FindThird(temp,8,13)) {}
		
		if (FindFirst(temp,9,12)) {}
		else if(FindSecond(temp,9,13)) {}
		else if (FindThird(temp,9,14)) {}
		
		if (FindFirst(temp,10,13)) {}
		else if(FindSecond(temp,10,14)) {}
		else if (FindThird(temp,10,15)) {}
	
		

		System.out.println("");
		
		return numbers;
		
	}

}
