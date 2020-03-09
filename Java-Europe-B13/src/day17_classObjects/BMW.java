package day17_classObjects;

public class BMW {

	
	String make="BMW";
	String model;
	double price;
	
	
	public void showPrice () {
		
		switch (model) {
		
		case "330i":
			price = 40250;
		case "740":
			price = 86000;
		case "m3":
			price = 65000;
		default: 
			System.out.println("Model is not available");
			price= 0.0;
		}
		
		System.out.println("Price " +price);
	}
}
