package day15_tasks;

public class methodOverloading {

	public static void main (String[] args) {
		
		System.out.println(sum(2,3));
		
		int x= sum(45, 55, 44);
		
		System.out.println(x);
	}
	
	public static int sum (int a, int b ) {
		return a+b;
	}
	
	public static int sum (int a, int b, int c) {
		return a+b+c;
		
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
}
