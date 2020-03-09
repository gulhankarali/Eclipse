package day4_arithmetic_operators;

public class Task16 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		double perimeter, area, radius=5.5;
		
		perimeter = 2*radius*PI;
		area = radius*radius*PI;
		
		System.out.println("perimeter "+ perimeter);
		System.out.println("area "+ area);
	}

}
