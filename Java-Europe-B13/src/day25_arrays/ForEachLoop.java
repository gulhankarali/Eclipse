package day25_arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] products= {"Timberland","shirt","watch", "bag","Shoes"};
		
		double[] prices = {100.0, 19.99, 250.0, 399.0, 76.99};
		
		for (String value : products) {
			
			System.out.println(value);
		}

		for (double value : prices) {
			
			System.out.println(value);
		}
		
		for (int i=4; i>=0; i--) {
			
			System.out.println(products[i]);
			
			System.out.println(prices[i]);
		}
		
		
		
		
		
	}

}
