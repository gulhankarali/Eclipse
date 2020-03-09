package day31_wrapperClassSubject;

public class WrapperClass {

	public static void main(String[] args) {

		int n1=10;
		
		Integer n2= new Integer(10);
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		double d1= 22.34;
		
		Double d2 = new Double(22.34);
		
		Double d3 = new Double("22.34");
		
		System.out.println(d1);
		
		System.out.println(d2);
		
		System.out.println(d1+d2+d3);
		
		char c1='D';
			
		Character c2=  new Character('D');
		
		System.out.println(c2);
		
		byte b1= 100;
		
		Byte b2 = new Byte ((byte)100);
		
		System.out.println(b1);
		
		System.out.println(b2);
		
		
		
	}

}
