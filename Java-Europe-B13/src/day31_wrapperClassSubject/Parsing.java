package day31_wrapperClassSubject;

public class Parsing {

	public static void main(String[] args) {

		String number= "2018";
		
		System.out.println(number);
		
		int numberS= Integer.parseInt(number);
		
		System.out.println(numberS);
		
		number+=1;
		
		numberS+=1;
		
		System.out.println(number);
		
		System.out.println(numberS);

		
		int i =10;
		
		String s= String.valueOf(i);
		
		System.out.println(s);
		
		String s2=Integer.toString(i);
		
		System.out.println(s2);
	}

}
