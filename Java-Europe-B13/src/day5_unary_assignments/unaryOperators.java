package day5_unary_assignments;

public class unaryOperators {

	public static void main(String[] args) {
		
		int i1= +10;
		
		int i2= -100;
		int i3= -(i1+i2);
				
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		
		boolean flag= true;
		
		System.out.println(!flag);
		System.out.println(!!flag);
		
		
		int i=10, j=5;
		
		System.out.println(i++);
		System.out.println(--j);
		
	    i=10;
	    j=5;
		i++;
		--j;

		System.out.println(i);
		System.out.println(j);
		
		int a=50;
		a= --a + a++ + a-- + a++;
		
		System.out.println(a);
		
		a=1;
		
		a= -a-- + a++ / -a-- * --a;
		
		System.out.println(a);
	
		
	}

}
