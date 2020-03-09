package day4_arithmetic_operators;

public class discount {

	
	public static void main (String[] args) {
		
		int regularPrice = 59;
		
		double discount ;
		
		double salesPrice;
		
		discount = regularPrice*0.2;
		salesPrice = regularPrice - discount;
		System.out.println("Regular Price of this item $ "+ regularPrice);
		System.out.println("sale price of this item $ "+ salesPrice);
		
	}
}
